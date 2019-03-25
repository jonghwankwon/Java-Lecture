package Openchallenge10_01;

import java.util.Scanner;

public class LoginExample {
	private static String[] idCheck = {"abcde", "fghij", "klmno", "pqrst", "uvwxyz"};
	private static String[] pwdCheck = {"abcde12", "fghij12", "klmno12", "pqrst12", "uvwxyz12"};

	public static void main(String[] args) {
		try {
			String id, pwd;
			Scanner sc = new Scanner(System.in);

			System.out.print("아이디를 입력해주세요 :");
			id = sc.nextLine();
			System.out.print("비밀번호를 입력해주세요 :");
			pwd = sc.nextLine();

			login(id, pwd);
			System.out.println("로그인 성공");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("다시 실행하세요.");
		}

	}

	public static void login(String id, String password) throws InvalidLoginIdException, IncorrectPasswordException {

		if(!idCheck(id)) {
			throw new InvalidLoginIdException("아이디가 존재하지 않습니다.");
		}

		if(!pwdCheck(password)) {
			throw new IncorrectPasswordException("패스워드가 틀립니다.");
		}

	}

	public static boolean idCheck(String id){
		boolean flag = false;
		for(int i=0; i<idCheck.length;i++){
			if(idCheck[i].equals(id)){
				flag = true;
			}
		}
		return flag;
	}
	//여기서 "boolean"은 입력 된 "id or pwd"가 배열에서 발견되는 즉시 루프를 종료
	public static boolean pwdCheck(String pwd){
		boolean flag = false;
		for(int i=0; i<pwdCheck.length;i++){
			if(pwdCheck[i].equals(pwd)){
				flag = true;
			}
		}
		return flag;
	}
}