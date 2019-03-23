package Openchallenge06_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculateExample {
	public static void main(String [] args) {

		try {
			Scanner scanner = new Scanner(System.in);
			System.out.print("두 정수와 연산자를 입력하시오 >> ");
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			char op = scanner.next().charAt(0);
			scanner.close();

			switch(op) {
			case '+':
				Add add = new Add();
				add.setValue(a, b);
				System.out.println(add.calculate());
				break;

			case '-':
				Sub sub = new Sub();
				sub.setValue(a, b);
				System.out.println(sub.calculate());
				break;

			case '*':
				Mul mul = new Mul();
				mul.setValue(a, b);
				System.out.println(mul.calculate());
				break;

			case '/':
				Div div = new Div();
				div.setValue(a, b);
				System.out.println(div.calculate());
				break;

			default:
				System.out.println("연산자를 잘못입력하셨습니다.");
				System.out.println("ex)두 정수와 연산자를 입력하시오 >> 7 5 +");
			}
		}
		catch(InputMismatchException e) {
			System.out.println("잘못 입력하셨습니다.");
			System.out.println("ex)두 정수와 연산자를 입력하시오 >> 7 5 +");
		}
	}

}
