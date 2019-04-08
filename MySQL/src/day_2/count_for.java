package day_2;

import java.util.Scanner;

public class count_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//for(초기값; 범위; 제어변수 변화식)
		
		//int i; //for문 밖에 해줘야 안없어짐 
		
		//for( int i=1; i<11; i++ )
		{
			//System.out.println(i);
		}
		
       // System.out.println("for문 종료후"+i);
		Scanner in=new Scanner(System.in);
		
	   int num;
	   int sum=0; //합을 저장할 변수
	   System.out.print("숫자를 입력하세요:");
	   num= in.nextInt();
	   
	   
	   
		for(int i=1; i<=num; i++)
		{
			
			sum+=i;//sum에 1부터 num까지의 값을 더해줌
		}
		
		System.out.println(sum);//결과값 출력

	}

}
