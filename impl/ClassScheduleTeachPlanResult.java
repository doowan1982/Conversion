package dataSource.impl;

import java.util.HashMap;
import java.util.Map;

import dataSource.IResults;
import dataSource.Record;
import dataSource.ReturnType;

public class ClassScheduleTeachPlanResult implements IResults {

	@Override
	public Map<String, Record> getList() {
		// TODO Auto-generated method stub
		Map<String,Record> list = new HashMap<String, Record>();
		list.put("TEACHER_ID", new Record("")); //
		list.put("USERNAME", new Record("")); //
		list.put("IS_FIRST_TEACH", new Record(ReturnType.INTEGER, 0)); //
		return null;
	}

}
