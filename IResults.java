package dataSource;

import java.util.Map;

/**
 * 该类型对应数据中的一行
 * @author doowan
 */
public interface IResults {
	
	/**
	 * 返回该行中多个字段
	 * @return Map
	 */
	Map<String,Record> getList();
}
