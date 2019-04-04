package Openchallenge11_01;

// i값 Stirng 변환 -> String 값 char배열로 변환 -> 루프 실행 -> 
//char 값 넘버 변환 -> cnt 에 곱셈 -> total 에 덧셈

public class TotalExample {
	public static void main(String[] args) {
		int total = 0;

		for(int i=10; i<=1000; i++){

			Integer num = i;
			int cnt = 1;
			String value = num.toString();
			char[] chArray = value.toCharArray();

			for( char ch : chArray){
				cnt *= Character.getNumericValue(ch);
			}
			total += cnt; 
		}
		System.out.println(total);

	}
}