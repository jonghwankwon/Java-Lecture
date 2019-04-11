package sec02_03_Reader;

import java.io.FileReader;
import java.io.Reader;

//read() 메소드 : 입력으로부터 한 개의 문자(2바이트)를 읽고 4바이트 int타입으로 리턴
public class ReadExample1 {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test.txt");
		int readData;
		while( true ) {
			readData = reader.read();
			if(readData == -1) 
				break;
			System.out.print((char)readData);	//char타입으로 형변환
		}
		reader.close();
	}
}
