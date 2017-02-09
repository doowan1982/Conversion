package dataSource.exception;

public class ConversionException extends Exception {

	private static final long serialVersionUID = 1L;
	private String message;
	public ConversionException(String message){
		this.message = message;
	}
	public String toString(){
		return this.message;
	}
}
