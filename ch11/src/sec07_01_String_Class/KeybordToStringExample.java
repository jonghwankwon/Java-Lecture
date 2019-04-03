package sec07_01_String_Class;

import java.io.IOException;

public class KeybordToStringExample {
	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		System.out.println("입력 : ");
		int readByteNo = System.in.read(bytes);
		for (int i=0; i<readByteNo; i++)
			System.out.println(bytes[i] + " ");
		System.out.println();
		
		String str = new String(bytes, 0, readByteNo-2);
		System.out.println(readByteNo + ", " + str);
	}
}
