package sec02_01_InputStream;

import java.io.FileInputStream;
import java.io.InputStream;

// read(byte[]b, int off, int len) 메소드 ↓↓↓
// 입력스트림으로부터 len개의 바이트만큼 읽고, 매개값으로 주어진 바이트 배열 b[off]부터 len개 까지 저장
// 그리고 읽은 바이트 수인 len개를 리턴
public class ReadExample3 {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		int readByteNo;
		byte[] readBytes = new byte[8];
		readByteNo = is.read(readBytes, 2, 3);
		for(int i=0; i<readBytes.length; i++) {
			System.out.println(readBytes[i]);
		}
		is.close();
	}
}
