package sec03_Promotion;

public class FromIntToDouble {

	public static void main(String[] args) {
		int num1 = 123456780;
		int num2 = 123456780;
		
		double num3 = num2;
		num2 = (int) num3;
		
		int result = num1 - num2;
		System.out.println(result);
		//System.out.println(num1 + "," + num2); 결과값:12345670, 123456780
	}

}
