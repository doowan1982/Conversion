package dataSource.exception;

public class TypeNotMatchException extends ConversionException {

	private static final long serialVersionUID = -5872074860770856369L;
	
	public TypeNotMatchException(String from, String to){
		super("类型不匹配。返回值类型为【"+ to + "】，给定值的类型为【"+ from + "】");
	}
}
