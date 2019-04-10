package sec05_03_Comparable;

import java.util.Arrays;

public class CompareTest_BubbleSort {
	public static void main(String[] args) {
		String[] names = {"김씨", "이씨", "권씨", "박씨", "한씨", "정씨"};
//		Arrays.sort(names);
		bubbleSort(names);
		System.out.println(Arrays.deepToString(names));
	}
	
	static void bubbleSort(String[] names) {
		int len = names.length;
		for(int i=0; i<len-1; i++) {
			for(int k=i+1; k<len; k++) {
				//names[i] 와 names[k]를 비교하여 조건에 맞으면 swap
				//String 비교는 compareTo
				if(names[i].compareTo(names[k]) > 0) {	// 값이 0이면 같은 값, 크면 1, 작으면 -1 
					String name = names[i];
					names[i] = names[k];
					names[k] = name;
				}
			}
		}
	}
}
