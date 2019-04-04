package Openchallenge11_02;

import java.util.Scanner;

public class dashInsertExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하세요 : ");
		String num = sc.nextLine();

		char[] ch = num.toCharArray();	//num에 저장한 문자를 한글자씩 잘라서 문자배열로 저장
		String result = "";

		for(int i = 0; i < ch.length-1; i++){	// i는 0부터 시작해서 한바퀴 돌때마다 1씩 늘어난다 ch의 길이의 -1만큼 반복
			if( ch[i]%2 == 1 && ch[i+1]%2 == 1 ){	// ch의 인덱스i에 들어가있는걸 2로 나눴을때 1이 나오거나(홀수거나) ch의 한칸 더 간 값도 2로 나눴을때 1이 나오면(홀수이면) if문에 진입
				result += ch[i] + "-";		// ch의 인덱스i에다 -문자열을 더한것과 result에 저장하고 그 최종값을 다시 result에 저장
			} else if (ch[i]%2 == 0 && ch[i+1]%2 == 0){	// 양쪽 모두가 짝수일때 진입
				result += ch[i] + "*";	// ch의 인덱스i에 * 문자열을 더해서 result에 저장
			} else {
				result += ch[i];	//result 에 ch배열의 마지막 글자를 더함
			}
		}
		result += ch[ch.length-1];

		System.out.println("출력결과 " + result);
	}
}

