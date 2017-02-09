package dataSource;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import dataSource.exception.ConversionException;
public class Conversion {
	
	/**
	 * 对传入的外部数据和内部bean做转换
	 * @param Class cls
	 * @param IDataSource source
	 * @return List
	 * @throws ConversionException
	 */
	public List<Object> convert(Class<?> cls, IDataSource source) throws ConversionException{
		Field[] fields = cls.getDeclaredFields();
		List<Object> list = new ArrayList<Object>();
		for(Map<String, Record> map : source.get()){
			Object instance = null;
			try{
				instance = cls.newInstance();					
			}catch(Exception e){
				throw new ConversionException("类实例化失败！");
			}
			for(Field field : fields){
				if(field.isAnnotationPresent(MappingAnnotation.class)){
					MappingAnnotation annotation = (MappingAnnotation)field.getAnnotation(MappingAnnotation.class);
					String fromFieldName = annotation.fromFieldName();
					if("".equals(fromFieldName)){
						fromFieldName = annotation.value();
					}
					if(map.containsKey(fromFieldName)){
						String methodName = getMethodName(field.getName());
//						System.out.println(methodName+"-----------------------------");
						try{
							Class<?> type = map.get(fromFieldName).getType();
							Object value = map.get(fromFieldName).getValue();
							Object test = value;
							if(test == null){
								test = "null";
							}
//							System.out.println(test);
							cls.getMethod(methodName, type).invoke(instance, value);
						}catch(NoSuchMethodException e){
							throw new ConversionException(instance.toString()+"：不存在【"+methodName+"】方法");
						}catch(IllegalArgumentException e){
							throw new ConversionException(instance.toString()+"：方法【"+methodName+"】，类型不匹配");
						}catch(Exception e){
							e.printStackTrace();
							throw new ConversionException(e.getMessage());
						}
					}else{
						throw new ConversionException("数据源中未包含【"+fromFieldName+"】字段！");
					}
				}
			}
			list.add(instance);
		}
		return list;
	}
	
	//根据当前类属性名称返回需调用的方法
	protected String getMethodName(String value){
		String last = value.substring(1);
		return "set"+value.substring(0, 1).toUpperCase()+last;
	}
}