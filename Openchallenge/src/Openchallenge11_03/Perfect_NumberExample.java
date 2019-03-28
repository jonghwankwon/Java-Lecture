package Openchallenge11_03;

import java.util.Scanner;

public class Perfect_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("수 입력 : ");
		int num = sc.nextInt();

		for(int i=1; i<=num; i++) {
			int sum = 0;
			for(int k=1; k<i; k++) {
				if(i%k == 0) {
					sum += k;
				}
			}
			if(i==sum) {
				System.out.println(i);
			}
		}

	}
}
