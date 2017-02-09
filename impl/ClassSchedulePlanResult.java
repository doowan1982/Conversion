package dataSource.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import dataSource.IResults;
import dataSource.Record;
import dataSource.exts.DateRecord;
import dataSource.exts.EnumRecord;

public class ClassSchedulePlanResult implements IResults {

	@Override
	public Map<String, Record> getList() {
		// TODO Auto-generated method stub
		Map<String,Record> list = new HashMap<String, Record>();
		list.put("OBJID", new Record("")); //
		list.put("CLASS_ROOM_ID", new Record("")); //
		list.put("SCHE_CONTENT", new Record("")); //
		//实现一个DateRecord子类，不对给定的日期进行解析
		list.put("SCHE_DATE", new Record(""){
			public String getValue(){
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				Date date = null;
				try{
					date = sdf.parse((String)this.value);					
				}catch(Exception e){
				}
				return sdf.format(date);
			}
		});
		Map<String, String> map = new HashMap<String, String>(){
			{
				put("0", "全天");
				put("1", "上午");
				put("2", "下午");
				put("3", "晚上");
			}
		};
		list.put("SCHE_TIME", new EnumRecord(map)); //
		return list;
	}

}
