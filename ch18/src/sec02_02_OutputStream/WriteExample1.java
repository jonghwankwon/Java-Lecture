package sec02_02_OutputStream;

import java.io.FileOutputStream;
import java.io.OutputStream;

//Write(int b) 메소드 : 매개 변수로 주어진 int값에서 끝에있는 1바이트만 출력스트림으로 보냄
//매개 변수가 int타입이므로 4바이트 모두를 보내는 것으로 오해할 수 있음
public class WriteExample1 {
	public static void main(String[] args) throws Exception{
	OutputStream os = new FileOutputStream("C:/Temp/test.txt");
			byte[] data = "ABC".getBytes();
		for(int i=0; i<data.length; i++) {
			os.write(data[i]);	//"A", "B", "C"를 하나씩 출력
		}
		os.flush();
		os.close();
	}
}
