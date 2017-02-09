package dataSource.exts;

import java.util.Map;

import dataSource.Record;

/**
 * 将获取到的数据转换为本地，针对固定格式
 * @author doowan
 *
 */
public class EnumRecord extends Record {
	
	private Map<String, String> map = null;
	
	//给定Map集合，该集合中需包含一个默认值
	public EnumRecord(Map<String, String> map){
		this(map, ""); //默认值为空
	}
	
	public EnumRecord(Map<String, String> map, Object defalutValue){
		super(defalutValue);
		this.map = map;
	}
	
	public Object getValue(){
		if(this.map.containsKey(this.value)){
			return this.map.get(this.value);
		}
		return this.defaultValue;
	}
}
