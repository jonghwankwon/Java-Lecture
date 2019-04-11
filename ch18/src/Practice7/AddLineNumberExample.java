package Practice7;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		//정확한 경로로 수정하세요.
		String filePath = "D:/GJH/Egov/java/ch18/src/sec05_02_Buffered_Reader/BufferedReaderExample.java";
		
		//작성위치
		//소스파일을 읽고, 라인번호를 추가시켜 출력하는 프로그램 작성
		FileReader fr = new FileReader("D:/GJH/Egov/java/ch18/src/sec05_02_Buffered_Reader/BufferedReaderExample.java");
		BufferedReader br = new BufferedReader(fr);
		
		int lineNum = 0;
		String rowData;
		while((rowData = br.readLine())!= null) {
			System.out.println(++lineNum + ":" + rowData);
		}
		br.close(); fr.close();
	}
}
