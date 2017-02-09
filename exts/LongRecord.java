package dataSource.exts;

import dataSource.Record;
import dataSource.ReturnType;

public class LongRecord extends Record {
	public LongRecord(){
		super(ReturnType.INTEGER);
	}
	
	public Long getValue(){
		if(this.value.getClass().getName() == Integer.class.getName()){
			return Long.decode(this.value.toString());
		}
		return (Long)this.value;
	}
}
