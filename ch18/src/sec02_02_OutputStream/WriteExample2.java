package sec02_02_OutputStream;

import java.io.FileOutputStream;
import java.io.OutputStream;

//Write(int[] b) 메소드 : 매개값으로 주어진 바이트 배열의 모든 바이트를 출력스트림으로 보냄
public class WriteExample2 {
	public static void main(String[] args) throws Exception{
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] data = "WriteExample2".getBytes();
		os.write(data);	//"ABC"를 모두 출력
		os.flush();
		os.close();
	}
}
