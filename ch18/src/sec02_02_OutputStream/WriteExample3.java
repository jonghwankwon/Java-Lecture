package sec02_02_OutputStream;

import java.io.FileOutputStream;
import java.io.OutputStream;

//Write(int[] b, int off, int len) 메소드 : b[off]로부터 len개의 바이트를 출력 
public class WriteExample3 {
	public static void main(String[] args) throws Exception{
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] data = "ABC".getBytes();
		os.write(data, 1, 2);	//offset = 1, len = 2	// 출력결과 => "BC" 
		os.flush();
		os.close();
	}
}
