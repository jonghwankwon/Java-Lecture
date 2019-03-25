package sec07_02;

import sec07_01.BalanceInsufficientException;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		//예금하기
		account.deposit(10000);
		System.out.println("예금액: " + account.getBalance());
		//출금하기
		try {
			account.withdraw(30000);
		} catch (BalanceInsufficientException e) {	//예외 메세지 얻기
			String message = e.getMessage();	//Account클래스에서 떠넘기기한 메세지를 끄집어냄
			System.out.println(message);
			System.out.println();	//예외 추적 후 출력
			e.printStackTrace();	//에러가 발생한 곳의 위치를 찾아줌
		}
	}
}
