package day_2;
import java.util.Scanner;
public class cont {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		//if(참/거짓)
		
		Scanner in=new Scanner(System.in);
		
		//int num;
		//num=in.nextInt();
		/*
		 값1  ==      값2 비교연산자 : 값1과 2가 같으면 ture
		 값1  !=(! =) 값2            : 값1과 값2가 다르면 Ture
		 값1  <=      값2            : 값 1보다 값2가 크면 ture
		 
		 논리값 사용
		 !값         : 반전 Ture는 fales로 false는 true로
		  값 || 값2  : or 값1과 값2가 둘 다 false만 아니면 ture
		  값 && 값2  : and 값1과 값2가 둘 다 ture여야 ture
		  */
		//if(논리값) : 논리값이 ture이면 if문 영역 안의 코드를 실행
		//else if(논리값) : 상위의 if 문이 거짓일 경우 else if 문 실행
		/*
		if(num%2==0)
			
		{
			System.out.println("입력한 숫자는 짝수입니다");
		}
		else if(num%2==1)
        {
        	System.out.println("입력한 숫자는 홀수입니다");
        }
        else
        {
        	System.out.println("입력한 숫자는 홀수입니다");
        }
		//성적 3개를 입력받아
		//성적들의 평균이 50점 미만이면 f 
		//60점 미만이면 d 
		//70 미만 e
		//80 미만 c
		//90 미만 b
		//90 이상 a
		//당신의 학점은 x입니다
		*/
		
		
		int num1,num2,num3;
	
		
		System.out.println("성적 3개를 입력하시오");
		
		num1= in.nextInt();
		num2= in.nextInt();
		num3= in.nextInt();
		
		int avg=(num1+num2+num3)/3;
		
		if(avg<50)
		{
			System.out.println("당신의 성적은 F입니다");
		}
		
		else if(avg<60)
		{
			System.out.println("당신의 성적은 E입니다");
		}
		
		else if (avg<70)
		{
			System.out.println("당신의 성적은 D입니다");
		}
		
		else if (avg<80)
		{
			System.out.println("당신의 성적은 C입니다");
		}
		
		else if (avg<90)
		{
			System.out.println("당신의 성적은 B입니다");
		}
		
		else if (avg>=90 && avg <= 100)//90점이상 100점 이하일경우
		{
			System.out.println("당신의 성적은 A입니다");
		}
		else
		{
			System.out.println("잘못된 값을 입력하셨습니다");
		}
		
		
		
		
		/*
		 System.out.println("합계:"+(num1+num2+num3));
		 System.out.println("평균:"+(float)(num1+num2+num3)/3);
		
		 if((float)(num1+num2+num3)/3<=50)
			 
		 {
			 System.out.println("당신의 성적은 F입니다");
		 }
        if((float)(num1+num2+num3)/3<=60)
			 
		 {
			 System.out.println("당신의 성적은 E입니다");
		 }
        if((float)(num1+num2+num3)/3<=70)
			 
		 {
			 System.out.println("당신의 성적은 D입니다");
		 }
        if((float)(num1+num2+num3)/3<=80)
			 
		 {
			 System.out.println("당신의 성적은 C입니다");
		 }
        if((float)(num1+num2+num3)/3<=90)
			 
		 {
			 System.out.println("당신의 성적은 B입니다");
		 }	
        if((float)(num1+num2+num3)/3>90)
			 
		 {
			 System.out.println("당신의 성적은 A입니다");
		 }*/
		 
	}

}
