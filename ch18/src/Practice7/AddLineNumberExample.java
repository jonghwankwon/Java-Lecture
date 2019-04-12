package Practice7;

import java.io.BufferedReader;
import java.io.FileReader;

public class AddLineNumberExample {
	public static void main(String[] args) throws Exception {
		String filePath = "D:/GJH/Egov/java/ch18/src/sec05_02_Buffered_Reader/BufferedReaderExample.java";
		
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
