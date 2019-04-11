package sec05_04_PrintStream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamExample {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Temp/test.txt");
		PrintStream ps = new PrintStream(fos);
		
		ps.println("[프린터 보조 스트림]");
		ps.print("마치 ");
		ps.println("프린터가 출력하는 것처럼 ");
		ps.println("데이터를 출력합니다.");
		ps.println(123);	//정수를 입력해도 문자열로 출력
		ps.println(3.14	);
		
		ps.flush();
		ps.close();
		fos.close();
	}
}
