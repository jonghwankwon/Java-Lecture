package sec04_02_File_Input_Stream;

import java.io.File;
import java.io.FileInputStream;

public class FileInputStreamExample {
	public static void main(String[] args) throws Exception {
		try {
			File file = new File("D:/GJH/Egov/java/ch18/src/sec04_02_File_Input_Stream/FileInputStreamExample.java");
			FileInputStream fis = new FileInputStream(file);
			
			int data;
			while( (data = fis.read() )!= -1) {	//1바이트씩 읽고 콘솔에 출력
				System.out.write(data);
			}
			fis.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
