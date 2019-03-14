package sec02;

public class SignOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = -100;
		int result1 = +x;
		int result2 = -x;
		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		
		short s = 100;
		short result3 = (short)-s; // short result3 = -s; //컴파일 에러로 인한 수정
		int result4 = -s;
		System.out.println("result4 = " + result4);
	}

}
