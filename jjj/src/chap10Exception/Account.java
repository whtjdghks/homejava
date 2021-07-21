package chap10Exception;

public class Account {
	private long balance;
	
	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	public void deposit(int money) {
		balance +=money;
	}									//▽사용자 정의 떠넘기기
	public void withdraw(int money)throws BalanceInsufficientException {
		if(balance<money) {
			throw new BalanceInsufficientException("잔고부족 :"+(money-balance)+"모자람");
		}	//사용자 정의 예외 발생 ▲
		balance -=money;
	}
}
