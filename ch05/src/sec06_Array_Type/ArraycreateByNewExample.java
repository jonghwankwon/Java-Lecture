package sec06_Array_Type;

import java.util.Arrays;

public class ArraycreateByNewExample {

	public static void main(String[] args) {
		int[] arr1 = new int[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}

		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		System.out.println(Arrays.toString(arr1));

		double[] arr2 = new double[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i + "] : " + arr2[i]);
		}

		arr2[0] = 0.1;
		arr2[1] = 0.2;
		arr2[2] = 0.3;
		for(int i=0; i<3; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);

		}
		String[] arr3 = new String[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}

		arr3[0] = "1월";
		arr3[1] = "2월";
		arr3[2] = "3월";
		for(int i=0; i<3; i++) {
			System.out.println("arr3[" + i + "] : " + arr3[i]);
		}
		//System.out.println(arr3.toString());
		System.out.println(Arrays.toString(arr3));
	}
}