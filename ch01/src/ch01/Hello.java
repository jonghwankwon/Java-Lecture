package ch01;

import java.util.Scanner;

public class Hello {

	public static void  main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 > ");
		int start = sc.nextInt();
		System.out.print("숫자를 하나 더 입력하세요 > ");
		int end = sc.nextInt();

		System.out.println(test(start, end));
	}
	
	
	public static int test(int box1, int box2){
		int k = 0;
		for( ; box1<=box2; box1++) {
			k = k+box1;
		}
		return k;
	}

}
