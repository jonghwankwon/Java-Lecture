package sec02_03_Reader;

import java.io.FileReader;
import java.io.Reader;

//read(char[] cbuf, int off, int len) 메소드
public class ReadExample3 {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test.txt");
		int readCharNo;
		char[] cbuf = new char[4];
		readCharNo = reader.read(cbuf, 1, 2);
		System.out.println(readCharNo);
		for(int i=0; i<cbuf.length; i++) {
			System.out.println(cbuf[i]);
	}
		reader.close();
	}
}
