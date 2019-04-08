package day_2;
import java.util.Scanner;
public class count_for3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		
		
		/*
		int arr[][]= new int[2][3];
		
		arr[0][0]=12;
        arr[0][1]=11;
 	
        for(int i =0; i<2; i++)
        {//처음 진입 시 i=0,j=0
        	//두번째 반복 i=0 , j=0
        	for(int j=0; j<3; j++)
        	{
        	arr[i][j]=in.nextInt();
        	}
        }*/
        
        //입력한 숫자의 구구단 출력
		/*
		int num;
		
		System.out.println("숫자를 입력 하세요.");
		
		num=in.nextInt();
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(num+"*"+i+"="+(num*i));
			
			
		}
		*/
		//int arr[][]= new int[]
        //1단부터 9단까지 구구단 출력 (2중 for문 사용)
		
		
		System.out.println("구구단 출력문");
		
		for(int i=2; i<10; i++)
		{
			for(int j=1; j<10; j++)
			{
				System.out.println(i+"*"+j+"="+(i*j));
			}
		}
		
		
	 }

}
