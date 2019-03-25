package Practice7;

//사용자 정의 예외 클래스
public class NotExistIDException extends Exception{
	public NotExistIDException() {}
	public NotExistIDException(String message) {
	super(message);
	}
}
