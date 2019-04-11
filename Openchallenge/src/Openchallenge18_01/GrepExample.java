package Openchallenge18_01;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class GrepExample {
	public static void main(String[] args) throws Exception {
		try {

			File file = new File("D:/GJH/Egov/java/Openchallenge/src/Openchallenge18_01/ClassA.java");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			int data;
			char[] cbuf = new char[100];
			while ((data=fr.read(cbuf))!= -1)
				fr.close();
	}
}



	/*	int lineNum = 0;
			String rowData = "public";
			while((rowData = br.readLine())!= null){
				System.out.println(++lineNum + " > " + rowData);
			}
			fr.close(); br.close();
		}catch(Exception e) {
			e.printStackTrace();
		}*/