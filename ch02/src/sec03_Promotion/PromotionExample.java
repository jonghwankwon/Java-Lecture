package sec03_Promotion;

public class PromotionExample {

	public static void main(String[] args) {
		byte byteValue = 10;
		int intValue = byteValue;			//int <-- byte
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;				//int <-- char
		System.out.println("가의 유니코드=" + intValue);
		
		intValue = 500;
		long longValue = intValue;			//int <-- char
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;		//double <-- int
		System.out.println(doubleValue);
		
		longValue = 123456789000L;
		float floatValue = longValue;		//long --> float 자동 변환
		System.out.println(floatValue);
		doubleValue = longValue;
		System.out.println(doubleValue);				

	}
	
}
