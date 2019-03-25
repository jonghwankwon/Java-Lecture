package Openchallenge10_04;

import java.util.Arrays;

public class Number {
	public static void main(String[] args) {

		int box[] = new int[10];

		for(int i=1; i<=1000; i++){
			box[i%10]++;
			if(i>=10) box[(i/10)%10]++;
			if(i>=100) box[(i/100)%10]++;
			if(i==1000) box[1]++;
		}
		System.out.println(Arrays.toString(box));

	}
}