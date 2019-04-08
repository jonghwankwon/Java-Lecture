package day_1;

import java.util.Scanner;

public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		/*
		String name,st;
		int num=0,num2=0,num3 ; 
		
		System.out.println("이름을 입력하시오");
		
		name=in.nextLine();
		System.out.println("이름:"+name);
		
        System.out.println("학과를 입력하시오");
		
		st=in.nextLine();
		System.out.println(st+"과");
		
		System.out.println("과목A의 성적을 입력하세요");
		
		
        num=in.nextInt();
		System.out.println("과목A:"+num);
		
        System.out.println("과목B의 성적을 입력하세요");
		
		
        num2=in.nextInt();
		System.out.println("과목B:"+num2);
		
		System.out.println("과목C의 성적을 입력하세요");
		num3=in.nextInt();
		System.out.println("과목C:"+num3);
		
		System.out.println("A"+num);
		System.out.println("b"+num2);
		System.out.println("c"+num3);
		System.out.println("평균:"+((num+num2+num3)/3));
		
		*/
		String name,dep;//이름 학과
		int num,num2,num3 ;//과목
		
		System.out.println("이름을 입력하세요");
		name= in.nextLine();//문자열 입력받기

		System.out.println("학과를 입력하세요");
		dep=in.nextLine(); //문자열 입력받기
		
		System.out.println("3과목의 점수를 입력하세요");
		num=in.nextInt();
	   num2=in.nextInt();
	   num3=in.nextInt();
	   
	   System.out.println(dep+"학과"+name+"님의 성적은");
	   System.out.println("과목1:"+num);
	   System.out.println("과목2:"+num2);
	   System.out.println("과목3:"+num3);
	   
	   System.out.println("합계:"+(num+num2+num3));
	   System.out.println("평균:"+(float)(num+num2+num3)/3);
	   
	   
	   
		
		
		
		
	}

}
