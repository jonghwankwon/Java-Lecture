package day_2;

import java.util.Scanner;

public class count_while {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		//while(논리값) : 논리값이 참일 경우 while문의 범위내 코드 반복
		//1부터 입력한숫자 까지의 합
		
		Scanner in=new Scanner(System.in);
		
		int num=1,num1;//num1은 정수를 입력받을 변수, num은 while문반복 제어정수
		int sum=0; //합을 저장할 변수
		System.out.println("숫자를 입력하세요");
		num1=in.nextInt();
		
		
		
		while(num<=num1)
		{
			System.out.println(num);
			sum+=num;//i값을 sum변수에 계속 더해준다
			num++;//while영역의 코드 1번 반복할때마다 num의 값이 1씩 증가
			
			
		
		}
		System.out.println("1부터 입력한 수 까지의 합은:"+sum);
	}

}
