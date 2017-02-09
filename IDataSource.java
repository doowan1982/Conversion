package dataSource;

import java.util.List;
import java.util.Map;

import dataSource.exception.ConversionException;

public interface IDataSource {
	
	/**
	 * 返回多个字段的列表
	 * Map:string 为数据库字段名
	 * @return List
	 */
	List<Map<String, Record>> get() throws ConversionException;
}