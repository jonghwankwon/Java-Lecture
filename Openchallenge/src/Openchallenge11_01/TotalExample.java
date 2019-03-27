package Openchallenge11_01;

public class TotalExample {
	public static void main(String[] args) {
		int result = 1; 
		int sum = 0;
		String str;

		for(int i=10; i<=1000; i++){
			str=String.valueOf(i);
			result = 1;

			for(int k=0; k<str.length(); k++){
				result *=(int)str.charAt(k)-48;
			}
			sum += result;
		}
		System.out.println(sum);
	}
}
