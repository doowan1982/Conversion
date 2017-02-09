package dataSource;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * 外部数据读取字段映射注解，
 * 当外部字段和本地字段一致时，只需给定value值。如果不一致，需同时设置
 * @author doowan
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MappingAnnotation {
	String fromFieldName() default ""; //外部字段
	String value() default ""; //本地字段
}