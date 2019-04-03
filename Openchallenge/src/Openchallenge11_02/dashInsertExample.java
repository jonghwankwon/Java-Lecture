package Openchallenge11_02;

import java.util.Scanner;

public class dashInsertExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 : ");
		String num = sc.nextLine();

		char[] ch = num.toCharArray();
		String result = "";

		for(int i = 0; i < ch.length-1; i++){
			if( ch[i]%2 == 1 && ch[i+1]%2 == 1 ){
				result += ch[i] + "-";
			} else if (ch[i]%2 == 0 && ch[i+1]%2 == 0){
				result += ch[i] + "*";
			} else {
				result += ch[i];
			}
		}
		result += ch[ch.length-1];

		System.out.println("출력결과 " + result);
	}
}
