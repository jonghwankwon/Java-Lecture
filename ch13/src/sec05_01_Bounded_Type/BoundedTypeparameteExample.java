package sec05_01_Bounded_Type;

public class BoundedTypeparameteExample {
	public static void main(String[] args) {
		//String str = Util.compare("a", "b"); //(x) String은 Number타입이 아님
		
		int result1 = Util.compare(10, 20);	//20 int->Integer 자동Boxing
		System.out.println(result1);
		
		int result2 = Util.compare(4.5, 3);	//4.5 double->Double 자동Boxing
		System.out.println(result2);
		
		int result3 = Util.compare(3, 3);
		System.out.println(result3);
	}
}
