package Openchallenge18_02;

import java.io.*;

public class HexaDumpExample {
	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		try {
			File file = new File("D:/GJH/Egov/java/Openchallenge/src/Openchallenge18_02/Hexa.java");
			FileInputStream fis = new FileInputStream(file);
			BufferedInputStream bis = new BufferedInputStream(fis);
			byte[] buffer = new byte[16];	//한번에 16개씩 읽도록
			int offset = 0, len = 0;

			while ((len = bis.read(buffer)) != -1) {
				System.out.printf("%08X: ", offset);
				offset += len;
				// print Hex Code 출력
				for(int i=0; i<len; i++) {
					System.out.printf("%02X " , buffer[i]);
					if(i==7)
						System.out.print(" ");
				}
				// print 문자열로 출력
				for (int k=0; k<offset+16; k++) { 
					if (k == len)    
						break;
					if (buffer[k] <= 32 || buffer[k] >= 127) {	//공백은 .으로 처리 
						System.out.print(".");
					} else {
						System.out.format("%c", buffer[k]);
					}
				}
				offset += 16; 
				System.out.println();
			}
			bis.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
// 출력 결과
/*00000000: 70 61 63 6B 61 67 65 20  4F 70 65 6E 63 68 61 6C package.Openchal
00000020: 6C 65 6E 67 65 31 38 5F  30 32 3B 0D 0A 0D 0A 70 lenge18_02;....p
00000040: 75 62 6C 69 63 20 63 6C  61 73 73 20 48 65 78 61 ublic.class.Hexa
00000060: 20 7B 0D 0A 09 70 75 62  6C 69 63 20 69 6E 74 20 .{...public.int.
00000080: 6E 75 6D 3B 0D 0A 09 70  75 62 6C 69 63 20 53 74 num;...public.St
000000A0: 72 69 6E 67 20 6E 61 6D  65 3B 0D 0A 0D 0A 7D 0D ring.name;....}.
000000C0: 0A 0D 0A 0D 0A 0D 0A 0D  0A .........*/