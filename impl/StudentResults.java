package dataSource.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dataSource.IResults;
import dataSource.Record;
import dataSource.ReturnType;

public class StudentResults implements IResults {
	
	@Override
	public Map<String,Record> getList() {
		// TODO Auto-generated method stub
		Map<String,Record> list = new HashMap<String, Record>();
		list.put("ID", new Record());
		list.put("NAME", new Record()); 	
		list.put("PHONE", new Record()); 	
		list.put("CARDID", new Record()); 	
		list.put("STUDENT_UNITY_CODE", new Record());
		list.put("PERSON_TYPE", new Record());
		list.put("NATION", new Record());
		list.put("BIRTHDAY", new Record());
		list.put("POLITICS_CODE", new Record());
		list.put("HIGHEST_EDU", new Record());
		list.put("GRADUATED_UVTY", new Record());
		list.put("GRADUATED_DATE", new Record()); 	
		list.put("PROFESSIONAL", new Record()); 	
		list.put("SUBORDINATE_UNIT", new Record()); 	
		list.put("WORK_UNIT", new Record()); 	
		list.put("DUTY", new Record()); 	
		list.put("ADDRESS", new Record()); 	
		list.put("TECHNICAL_TITLES", new Record()); 	
		list.put("IS_ACTIVE", new Record());
		return list;
	}

}
