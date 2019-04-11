package sec02_03_Reader;

import java.io.FileReader;
import java.io.Reader;

//read(char[] cbuf) 메소드
public class ReadExample2 {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test.txt");
		int readCharNo;
		char[] cbuf = new char[2];
		String data = "";
		while( true ) {
			readCharNo = reader.read(cbuf);
			System.out.print((char)readCharNo);	//char타입으로 형변환
			if(readCharNo == -1)
				break;
			data += new String(cbuf, 0, readCharNo);
		}
		System.out.println(data);
		reader.close();
	}
}
