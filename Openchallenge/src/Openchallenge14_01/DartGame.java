package Openchallenge14_01;

import java.util.Scanner;

public class DartGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dart result :");
		String n = sc.nextLine();
		int count = 0;

		int point[] = new int[n.length()];

		for(int i=0; i<n.length(); i++) {
			if(n.charAt(i) == 'S') {
				if(n.charAt(i-1) == '0' && n.charAt(i-2) == '1') {
					point[count++] = 10;
				}
				else {
					point[count++] = n.charAt(i-1)-48;
				}
			}

			if(n.charAt(i) == 'D') {
				if(n.charAt(i-1) == '0' && n.charAt(i-2) == '1') {
					point[count++] = 20;
				}
				else {
					point[count++] = (n.charAt(i-1)-48)*(n.charAt(i-1)-48);
				}
			}

			if(n.charAt(i) == 'T') {
				if(n.charAt(i-1) == '0' && n.charAt(i-2) == '1') {
					point[count++] = 30;
				}
				else {
					point[count++] = (n.charAt(i-1)-48)*(n.charAt(i-1)-48)*(n.charAt(i-1)-48);
				}
			}

			if(n.charAt(i) == '*') {
				if(count == 1) {
					point[count-1] *= 2;
				}
				else {
					point[count-1] *= 2;
					point[count-2] *= 2;
				}
			}

			if(n.charAt(i) == '#') {
				point[count-1] *= -1;
			}
		}

		int sum = 0;

		for(int i=0; i<point.length; i++) {
			sum += point[i];
		}
		System.out.println("점수 > " + sum);

	}

}