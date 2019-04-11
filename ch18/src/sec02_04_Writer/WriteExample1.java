package sec02_04_Writer;

import java.io.FileWriter;
import java.io.Writer;

//Write(int c) 메소드
public class WriteExample1 {
	public static void main(String[] args) throws Exception {
		Writer wirter = new FileWriter("C:/Temp/test.txt");
		char[] data = "홍길동".toCharArray();
		for(int i=0; i<data.length; i++) {
			wirter.write(data[i]);	//"홍", "길", "동"을 하나씩 출력
		}
		wirter.flush();
		wirter.close();
	}

}

