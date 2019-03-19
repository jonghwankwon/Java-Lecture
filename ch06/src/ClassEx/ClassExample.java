package ClassEx;

import java.util.Scanner;

public class ClassExample {
	
	public static void main(String[] args) {
//		5-1 이름과 수학, 영어, 과학 성적을 입력으로 받아서 
//		5-2 이름과 수학, 영어, 과학, 평균을 출력하는 프로그램을 작성하시오. 

//					5-1
		Scanner scan = new Scanner(System.in);
		System.out.print("성명> ");
		String name = scan.nextLine();
		System.out.print("수학> ");
		int math = Integer.parseInt(scan.nextLine());
		System.out.print("영어> ");
		int english = Integer.parseInt(scan.nextLine());
		System.out.print("과학> ");
		int science = Integer.parseInt(scan.nextLine());
		scan.close();
		
//					5-2		
		StudentScore ss = new StudentScore(name, math, english, science);
		double avg = ss.average();
		System.out.printf("평균: %.2f\n", avg);
		System.out.println(ss.toString());
	}
}