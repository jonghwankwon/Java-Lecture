package sec02_04_Writer;

import java.io.FileWriter;
import java.io.Writer;

//Write(char[] cbuf) 메소드
public class WriteExample2 {
	public static void main(String[] args) throws Exception {
		Writer wirter = new FileWriter("C:/Temp/test.txt");
		char[] data = "홍길동 홍길동".toCharArray();
		wirter.write(data);	//"홍길동" 모두출력
		wirter.flush();
		wirter.close();
	}

}

