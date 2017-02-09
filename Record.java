package dataSource;

import dataSource.exception.ConversionException;
import dataSource.exception.TypeNotMatchException;

/**
 * 该类型对应数据中的列
 * @author doowan
 */
public class Record{
	
	protected Object value; //字段值
	protected Object defaultValue; //默认值
	protected Class<?> type; //该字段返回的类型
	protected boolean hasNull; //是否可以为null
	
	//默认构造方法为String类型
	public Record(){
		this(ReturnType.STRING);
	}
	
	public Record(Class<?> returnType){
		this(returnType, true); //默认可以为null
	}
	
	public Record(Object defaultValue){
		this(ReturnType.STRING, defaultValue);
	}
	
	public Record(Class<?> returnType, Object defaultValue){
		//给定默认值时，将默认该字段不能为空
		this(returnType, false, defaultValue);
	}
	
	public Record(Class<?> returnType, boolean hasNull){
		this(returnType, hasNull, null);
	}
	
	public Record(Class<?> type, boolean hasNull, Object defaultValue){
		this.type = type;
		this.hasNull = hasNull;
		this.defaultValue = defaultValue;
	}
	
	public void setValue(Object value) throws ConversionException{
		//value为null，同时该值不能为null时
		if(value == null && !this.hasNull){
			//默认值也为null，将抛出异常
			if(this.defaultValue == null){
				throw new ConversionException("值不能为null");
			}
			//验证默认值是否为匹配类型，不匹配则抛出异常
			if(!this.hasMatchType()){
				throw new TypeNotMatchException(this.type.getName(), this.defaultValue.getClass().getName());
			}
			value = this.defaultValue;
		}
		this.value = value;
	}
	
	public Object getValue(){
		return this.value;
	}

	public Class<?> getType(){
		return this.type;
	}
	
	//默认值与返回类型一致是否为同一类型
	public boolean hasMatchType(){
		if(this.defaultValue == null){
			return true;
		}
		return this.type.getName().equals(this.defaultValue.getClass().getName());
	}
}
