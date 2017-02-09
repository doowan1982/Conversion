package dataSource.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import dataSource.IDataSource;
import dataSource.IResults;
import dataSource.Record;
import dataSource.exception.ConversionException;

public class DefaultDataSource implements IDataSource {
	
	private List<Map<String, Object>> data = new ArrayList<Map<String, Object>>();
	
	private IResults results = null;
	
	public DefaultDataSource(IResults results, List<Map<String, Object>> data){
		this.results = results;
		this.data = data;
	}
	
	@Override
	public List<Map<String, Record>> get() throws ConversionException {
		// TODO Auto-generated method stub
		List<Map<String, Record>> lists = new ArrayList<Map<String, Record>>();
		for(Map<String,Object> map : this.data){
			Map<String, Record> result = this.results.getList();
			Set<String> keys = map.keySet();
			for(String key : keys){
				result.get(key).setValue(map.get(key));
			}
			lists.add(result);
		}
		return lists;
	}
}
