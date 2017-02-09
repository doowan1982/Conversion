package dataSource.impl;

import java.util.HashMap;
import java.util.Map;

import dataSource.IResults;
import dataSource.Record;
import dataSource.ReturnType;
import dataSource.exts.DateRecord;

public class UserResults implements IResults {

	@Override
	public Map<String, Record> getList() {
		// TODO Auto-generated method stub
		Map<String,Record> list = new HashMap<String, Record>();
		list.put("LECTURER_NAME", new Record(""));
		list.put("TELEPHONE", new Record(""));
		list.put("LECTURER_ID", new Record(""));
		list.put("LECTURER_UNITY_CODE", new Record(""));
		list.put("SEX", new Record(""));
		list.put("NATION", new Record(""));
		list.put("BIRTHDAY", new Record(""));
		list.put("POLITICS_CODE", new Record(""));
		list.put("ID_CARD", new Record(""));
		list.put("PROFESSIONAL_TITILE", new Record(""));
		list.put("GRADUATED_UVTY", new Record(""));
		list.put("PROFESSIONAL", new Record(""));
		list.put("HIGHEST_EDUCATION", new Record(""));
		list.put("HIGHEST_DEGREE", new Record(""));
		list.put("WORK_UNIT", new Record(""));
		list.put("DUTY", new Record(""));
		list.put("SKILL_LEVEL", new Record(""));
		list.put("ADDRESS", new Record(""));
		list.put("POSTALCODE", new Record(""));
		list.put("PERSON_PROJECTERS", new Record(""));
		list.put("COMMITTEE_MEMBER", new Record(""));
		list.put("SPERKER_TYPE", new Record(""));
		list.put("TEACHER_RESUME", new Record(""));
		list.put("INTERNAL_CLASSIFICATIN", new Record(""));
		list.put("EXPERT_TYPE", new Record(""));
		list.put("IS_SCHOOL_TEACHERS", new Record(""));
		list.put("TECHNICAL_POST", new Record(""));
		list.put("SUBORDINATE_UNIT", new Record(""));
		list.put("REMARK", new Record(""));
		list.put("STATE", new Record(""));
		list.put("IS_ACTIVE", new Record(""));
		return list;
	}

}
