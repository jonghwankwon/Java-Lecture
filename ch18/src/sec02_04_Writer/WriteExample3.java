package sec02_04_Writer;

import java.io.FileWriter;
import java.io.Writer;

//Write(char[] c, int off, int len) 메소드
public class WriteExample3 {
	public static void main(String[] args) throws Exception {
		Writer wirter = new FileWriter("C:/Temp/test.txt");
		char[] data = "홍길동".toCharArray();
		wirter.write(data, 1, 2);	//"길동"만 출력
		wirter.flush();
		wirter.close();
	}
}
