package day_2;
import java.util.Scanner;
public class cont_switch 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        
		//switch(값)
		//case 값 :
		//case 값 :
		//....
		/*
		switch(2)
		{
		case 1://case 값에 대응되는 코드 실행
			System.out.println("1입니다 ");
			break;
		case 2:
			System.out.println("2입니다 ");
			break;
		case 'a':
			System.out.println("a입니다 ");
			break;
		default:
			System.out.println("해당안됨");
		}
		*/
		
		Scanner in=new Scanner(System.in);
		
		int num1,num2,num3;
		
		System.out.println("성적 3개를 입력하세요");
		
		num1=in.nextInt();
		num2=in.nextInt();
		num3=in.nextInt();
		
		int avg=(num1+num2+num3)/3;
		
		switch(avg/10)//평균을 10으로 나눈 값을 switch 판별값으로 사용
		{
		case 10://case 값에 대응되는 코드 실행
			System.out.println("A입니다 ");
			break;
		case 9:
			System.out.println("B입니다 ");
			break;	
		case 8:
			System.out.println("C입니다 ");
			break;
		case 7:
			System.out.println("D입니다 ");
			break;
		case 6:
			System.out.println("E입니다 ");
			break;
		default:
			System.out.println("F입니다 ");
			break;
         }
	}

}
