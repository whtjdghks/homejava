package chap10Exception;

public class BalanceInsufficientException extends Exception {
	public BalanceInsufficientException() {}//위 exception은 모든 오류의 집합
	public BalanceInsufficientException(String message) {
		super(message);//exception을 부름
		
	}
}
