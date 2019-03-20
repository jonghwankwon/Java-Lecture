package Practice19;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account(); // Account 객체 생성
		
		account.setBalance(10000); 
		System.out.println("현재 잔고: " + account.getBalance());	//getter 사용 잔고확인
		
		account.setBalance(-100);
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(2000000);	// MAX_BALANCE 1000000 초과이므로 true이므로 출력값 = 10000
		System.out.println("현재 잔고: " + account.getBalance());
		
		account.setBalance(300000);		//true 출력값 300000
		System.out.println("현재 잔고: " + account.getBalance());

	}

}
