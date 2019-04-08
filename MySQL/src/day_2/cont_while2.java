package day_2;
import java.util.Scanner;
public class cont_while2 
{
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		Scanner in=new Scanner(System.in);
		int sel;
		
		while(true)
		{
			System.out.println("1.도서 추가");
			System.out.println("2.도서 삭제");
			System.out.println("3.도서 관리");
			System.out.println("4.종료");
			
			System.out.println("실행할 기능을 선택하세요:");
		    sel=in.nextInt();
		    
		   if(sel==1)
		   {
			   System.out.println("도서추가기능 실행");
		   }
		   else if(sel==4) break;
	}
		
		
}



}
