package sec04;

//char 타입 연산
public class CharoperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c1 = 'A' + 1; 
		char c2 = 'A'; 
		char c3 = (char)(c2 + 1);  // char c3 = c2 + 1; => 컴파일 에러
		
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("c3: " + c3);
	}

}
