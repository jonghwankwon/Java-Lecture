package sec07_02_Account;

import sec07_01_BalanceInsufficient.BalanceInsufficientException;

public class Account {
	private long balance;
	
	public Account() {}
	
	public long getBalance() {
		return balance;
	}
	public void deposit(int money) {
		balance += money;
	}
	public void withdraw(int money) throws BalanceInsufficientException{	
								  //throws BalanceInsufficientException : 사용자 정의 예외 떠넘기기
		if(balance < money) {
			throw new BalanceInsufficientException("잔고부족: " + (money-balance) + " 모자람");
			//	19번 라인	↑ 사용자 정의 예외 발생 ↑
		}
		balance -= money;
	}
}
