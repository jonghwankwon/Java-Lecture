package sec02_04_Writer;

import java.io.FileWriter;
import java.io.Writer;

//Write(String str)와 write(String str, int off, int len)
public class WriteExample4 {
	public static void main(String[] args) throws Exception {
		Writer wirter = new FileWriter("C:/Temp/test.txt");
		String data = "안녕 자바 프로그램";
//		wirter.write(data);	//"안녕 자바 프로그램" 모두 출력
		wirter.write(data, 3, 2);	//"자바" 출력
		wirter.flush();
		wirter.close();
	}

}

