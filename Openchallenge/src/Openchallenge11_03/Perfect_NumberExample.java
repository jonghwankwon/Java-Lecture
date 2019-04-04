package Openchallenge11_03;

import java.util.Scanner;

public class Perfect_NumberExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("수 입력 : ");
		int num = sc.nextInt();		// 콘솔창에서 입력받은걸 num이라는 변수에 저장

		for(int i=1; i<=num; i++) {		// i를 1부터시작하여 한바퀴 돌때마다 1씩 더해지는데 입력받은 숫자보다 커지면 종료
			int sum = 0;
			for(int k=1; k<i; k++) {	// k를 1부터 시작하여 한바퀴 돌때마다 1씩 더해지는데 i보다 커지면 종료
				if(i%k == 0) {			// i를 k로 나눴을때 딱 맞아떨어지면 진입
					sum += k;
				}
			}
			if(i==sum) {
				System.out.println(i);
			}
		}

	}
}