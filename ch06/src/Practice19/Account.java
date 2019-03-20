package Practice19;

public class Account {
	//상수 선언 대문자로
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	
	private int balance;

	
	//Getter & Setter 생성 (source generate getter and setter)
	//getter 그대로 필드값 리턴
	public int getBalance() {
		return balance;
	}
	//외부 값을 받고, 요소검사 = if()
	public void setBalance(int balance) {		//요소 검사 후 올바른 값만 필드에 저장
		if(balance<Account.MIN_BALANCE || 		//매개변수 값
			balance>Account.MAX_BALANCE) {
			return; // false면 올바른 값
		}
		this.balance = balance;
	}
	
	
}
