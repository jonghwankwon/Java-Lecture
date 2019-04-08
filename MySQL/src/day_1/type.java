package day_1;

public class type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte   b=20;
		int    i=30;
		double d=20.3;
		char   ch='a';
		Integer inte=10;
		String st="30";
				
		//바꿀타임) 변수명 으로 ㅕㅂㄴ수의 타입을 변환가능
		//자기보다 용량이 큰 타임으로 변환이 필요할시
		//자동 형변환
		i=b;
		
		//그렇지 않을경우 명시적 형변환 필요
		b=(byte)i; 
		
		i=(int)d;
		
		//System.out.println((int)ch);
		//우ㅣ의 형변환 예는 모드 프리미티브 타입만 가능
		i= Integer.parseInt(st);
		
		System.out.println(i);
		
		
	}

}
