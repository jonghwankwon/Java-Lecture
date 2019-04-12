package Openchallenge18_01;

import java.io.*;

//특정 문자열이 포함된 라인을 출력 Unix의 Grep기능
public class GrepExample {
	public static void main(String[] args) throws IOException {

		InputStream input = System.in;
		Reader reader = new InputStreamReader(input);
		BufferedReader br = new BufferedReader(reader);
		
		try {
			System.out.print("검색할 문자 입력 : ");
			String inputString = br.readLine();

			System.out.println("검색할 파일 경로 입력");
			System.out.print("> ");
			String inputPathString = br.readLine();
			
			checkFile(inputString, inputPathString);
		} catch (IOException e) {
			System.out.println("오류 발생");
			e.printStackTrace();
		}
	}
	public static void checkFile(String name, String path) {
		try {
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			
			String str;
			int num = 1;
			while((str = br.readLine()) != null) {
				if(str.contains(name)) {
					System.out.printf( "%4d : " + str + "\n", num++);
				}
			}
			br.close();
		}catch (FileNotFoundException e) {
			System.out.println("파일이 존재하지않습니다.");
			e.printStackTrace();
		}catch (IOException e) {
			System.out.println("파일을 읽는 도중 오류 발생");
			e.printStackTrace();
		}
	}
}
// D:/GJH/Egov/java/Openchallenge/src/Openchallenge18_01/ClassA.java
