package day_2;
import java.util.Scanner;
public class count_for2 {
	public static void main(String[] args) 
	{
		Scanner in=new Scanner(System.in);
	
		/*
		int arr[] = new int[3]; //크기가 3인 정수형 배열 생성
		
		
		//이런 입력문
		arr[0]=in.nextInt();
		arr[1]=in.nextInt();
		arr[2]=in.nextInt();
		
		
		//for문을 사용해서 한줄로 표현 가능
		for(int i=0; i<3; i++)
		{
			arr[i]=in.nextInt();
		}*/
		
		
		//크기가 5인 정수 배열을 만들고
		//값을 입력 후 , 모두 출력하는 프로그램을 구현
		//최대값 구하기
		//
	
	   int arr[] =new int[5];//크기 5의 배열선언
	   int max;//최대값을 저장할 변수
	   
	   for(int i=0; i<arr.length; i++)
	   {
		 arr[i]=in.nextInt(); //배열 요소를 입력
		 
	   }
	   max=arr[0]; //배열의 첫번째 요소를 max 변수에 대입
	   
	   for(int i=1; i<arr.length; i++)//배열 요소를 순회하며 max값을 변화시킴
	   {
		   if(max < arr[i]) max=arr[i]; //max값보다 arr[i] 값이 클경우 max값을 교체
	   }
	   
	   
	   for(int i=0; i<arr.length; i++)
	   {
		   System.out.println(arr[i]+"  ");
		 
	   }
	   System.out.println("\n최대값은"+max+"  ");//max에 최대값이 담기게 됨
		
		
		
		
		
		
	}
}
