package jdbc.exception;

public class DuplicateIDException extends Exception{

	public DuplicateIDException() {
		this("This is DuplicateIDException..");
	}
	
	public DuplicateIDException(String mssage) {
		super(mssage);
	}

}