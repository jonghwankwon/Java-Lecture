package test11;

//for 문을 이용해서 1부터 1,000까지의 정수중에서 7의 배수의 총합을 구하는 코드 작성
public class Summation {
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1; i<=1000; i++) {
		if (i%7==0) sum+=i;	
		}
		System.out.println("7의 배수의 총합 " + sum);
	}
}