package dataSource.impl;

import java.util.HashMap;
import java.util.Map;

import dataSource.IResults;
import dataSource.Record;
import dataSource.ReturnType;
import dataSource.exts.DateRecord;

public class MonthPlanResults implements IResults {

	@Override
	public Map<String, Record> getList() {
		// TODO Auto-generated method stub
		Map<String,Record> list = new HashMap<String, Record>();
		list.put("PROJECTPLAN_MONTH", new Record("")); //
		list.put("PLANMONTH_ID", new Record("")); //
		list.put("PROJECT_NO", new Record("")); //
		list.put("PLAN_SEQUENCE", new Record("")); //
		list.put("PROJECT_UNITY_CODE", new Record(""));
		list.put("PROJECT_NAME", new Record("")); //
		list.put("TRAN_CONTENT", new Record("")); //
		list.put("ATTENDEE", new Record("")); //
		list.put("PLAN_ATTENDEE", new Record(ReturnType.INTEGER, 0)); //
		list.put("PREDICT_ATTENDEE", new Record(ReturnType.INTEGER, 0));//
		list.put("TRAN_DAYS", new Record(ReturnType.INTEGER, 0)); //
		list.put("REGISTER_DATE", new DateRecord("yyyy-MM-dd")); //
		list.put("BACK_DATE", new DateRecord("yyyy-MM-dd")); //
		list.put("SPONSOR_ID", new Record("")); //
		list.put("ACCOM_PLACE", new Record("")); //
		list.put("DINING_ADD", new Record("")); //
		list.put("COST_CRITER", new Record(ReturnType.FLOAT, 0.0f)); //
		list.put("OTHERE", new Record(ReturnType.FLOAT, 0.0f)); //
		list.put("TOTAL", new Record(ReturnType.FLOAT, 0.0f)); //
		list.put("APPLY_END_DATE", new Record("")); //
		list.put("REMARK", new Record("")); //
		list.put("IS_BRAND", new Record("")); //
		list.put("IS_HOT", new Record("")); //
		list.put("CLASSROOM", new Record("")); //
		list.put("IS_CHARA_PRJ", new Record(ReturnType.INTEGER, 0)); //
		list.put("MASTER_ORG_DEPARTMENT", new Record("")); //
		list.put("MASTER_ORG_DEPARTMENT_ID", new Record("")); //
		list.put("MASTER_ORG_HEAD_PERSON", new Record("")); //
		list.put("MASTER_ORG_ID", new Record("")); //
		list.put("MASTER_ORG_NAME", new Record("")); //
		list.put("MASTER_ORG_PLAN_PERSON", new Record("")); //
		list.put("PERIOD_ORDER", new Record(ReturnType.INTEGER, 0)); //
		list.put("PLAN_IMPL_STATUS", new Record(ReturnType.INTEGER, 0)); //
		list.put("PLAN_PERIOD", new Record(ReturnType.INTEGER, 0)); //
		list.put("PLAN_PERSON_DAY", new Record(ReturnType.INTEGER, 0)); //
		list.put("PLAN_STATUS", new Record(ReturnType.INTEGER, 0)); //
		list.put("PRJ_DIRECTION_ID", new Record("")); //
		list.put("PRJ_GRADED_ID", new Record("")); //
		list.put("PRJ_NATURE_ID", new Record("")); //
		list.put("PRJ_SOURCE_ID", new Record("")); //
		list.put("PRJ_TYPE_CODE", new Record("")); //
		list.put("PROJECT_TYPE", new Record("")); //
		list.put("RESIT_COUNT", new Record(ReturnType.INTEGER, 0)); //
		list.put("SIGNUP_COUNT", new Record(ReturnType.INTEGER, 0)); //
		list.put("TRAIN_MODE_ID", new Record("")); //
		list.put("TRAIN_STYLES_ID", new Record("")); //
		list.put("PERIOD_ORDER", new Record(ReturnType.INTEGER, 0)); //
		return list;
	}

}
