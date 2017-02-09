package dataSource.exts;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import dataSource.Record;
import dataSource.ReturnType;
import dataSource.exception.ConversionException;

/**
 * 用于字符串转日期类型的字段处理
 * @author Administrator
 */
public class DateRecord extends Record {
	protected String format; //日期的格式
	
	public DateRecord(String format){
		super(ReturnType.DATE, true, null); //默认执行字符串的构造方法
		this.format = format;
	}
	
	public DateRecord(String format, Object defaultValue){
		super(ReturnType.DATE, false, defaultValue);
		this.format = format;
	}
	
	@Override
	public void setValue(Object value) throws ConversionException{
		if(value == null || "".equals((String)value)){
			value = "20100101";
		}
		super.setValue(value);
		this.value = this.parse((String)this.value);
	}
	
	@Override
	public Date getValue(){
		SimpleDateFormat sdf = new SimpleDateFormat(this.format);
		Date date = null;
		try{
			date = sdf.parse((String)this.value);
		}catch(ParseException e){
			e.printStackTrace();
			date = new Date(); //当解析发生异常时，将默认使用当前时间
		}
		return date;
	}
	
	//通过格式化字符串解析给定的值
	protected String parse(String str){
		str = str.replaceAll("[^\\d]", ""); //仅保留数字
		List<Object[]> formatList = this.getPositions("[^A-Za-z]", this.format);
		int length = str.length();
		int size = formatList.size();
		int formatLength = this.format.length() - size; //将format的值去掉分隔符与value比较
		//如果给定的值长度小于格式化字符串，则补“0”
		if(length < formatLength){
			while(length < formatLength){
				str += "0";
				formatLength--;
			}
		}
		//将指定的分隔符插入value中
		int count = 0;
		while(count < size){
			Object[] obj = formatList.get(count++);
			Integer	end = (Integer)obj[0];
			str = str.substring(0, end -= 1) + (String)obj[1] + str.substring(end);
		}
		return str;
	}

	//返回正则表达式匹配值的位置偏移及匹配的值
	private List<Object[]> getPositions(String reg, String value){
		Matcher matcher = Pattern.compile(reg).matcher(value);
		matcher.matches();
		List<Object[]> list = new ArrayList<Object[]>();
		while(matcher.find()){
			//[截止位置，匹配的值 ]
			list.add(new Object[]{matcher.end(), matcher.group()});
		}
		return list;
	}
}
