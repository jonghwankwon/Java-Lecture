package sec03_Promotion;

public class FromIntFloat {

	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2;
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result); //결과값: -4
		//System.out.println(num1 + "," + num2); 결과값:12345670, 123456784
		
	}

}
