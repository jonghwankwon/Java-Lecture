package sec02_02_switch;
import java.util.Scanner;

public class SwitchStringExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("직급을 입력하세요: ");
		String position = sc.next();
		
		switch(position) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;							
		default:
			System.out.println("300만원");
		}
		sc.close();
	}
}
