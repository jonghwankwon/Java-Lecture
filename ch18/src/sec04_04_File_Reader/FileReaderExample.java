package sec04_04_File_Reader;

import java.io.FileReader;

public class FileReaderExample {
	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("D:\\GJH\\Egov\\java\\ch18\\src\\sec04_04_File_Reader\\FileReaderExample.java");
		
		int readCharNo;
		char[] cbuf = new char[100];
		while((readCharNo = fr.read(cbuf))!= -1) {
			String data = new String(cbuf, 0, readCharNo);
			System.out.print(data);
		}
		fr.close();
	}
}
