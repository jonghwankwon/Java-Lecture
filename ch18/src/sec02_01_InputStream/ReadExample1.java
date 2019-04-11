package sec02_01_InputStream;

import java.io.FileInputStream;
import java.io.InputStream;

// read() 메소드 : 
public class ReadExample1 {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test.txt");	//"C:\temp\test.txt" -> "\t" 로읽어지기 때문에 "C:\\Temp\\test.txt"로 사용
		int readByte;
		while(true) {
			readByte = is.read();		//Read() 메소드는 입력스트림으로부터 1바이트를 읽고 4바이트 int 타입으로 리턴
			if(readByte == -1)break;	//txt파일을 다읽으면 -1
			System.out.println((char)readByte);	//char로 형변환 (char)이 없다면 아스키코드로 출력
		}
		is.close();
	}
}
