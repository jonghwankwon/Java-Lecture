package Openchallenge18_06;

import java.io.File;
import java.io.FileOutputStream;

public class RandomExample {
	public static void main(String[] args) throws Exception {
		mkdirs();
		String fileName = null;
		for (int i=0; i<100; i++) {
			int numFile = (int)(Math.random() * 9000) + 1000;
			int numContent = (int)(Math.random() * 3) + 1;
			if (numFile <= 3333) {
				fileName = "c:/Temp/Test/low/" + numContent + "/" + numFile + ".txt";
			} else if (numFile <= 6666) {
				fileName = "c:/Temp/Test/mid/" + numContent + "/" + numFile + ".txt";
			} else {
				fileName = "c:/Temp/Test/high/" + numContent + "/" + numFile + ".txt";
			}
			FileOutputStream fos = new FileOutputStream(fileName);
			int content = (int)'0' + numContent;
			fos.write(content);
			fos.flush();
			fos.close();
		}
	}
	static void mkdirs() {
		File file = new File("c:/Temp/Test/low/1");
		file.mkdirs();
		file = new File("c:/Temp/Test/low/2");
		file.mkdirs();
		file = new File("c:/Temp/Test/low/3");
		file.mkdirs();
		file = new File("c:/Temp/Test/mid/1");
		file.mkdirs();
		file = new File("c:/Temp/Test/mid/2");
		file.mkdirs();
		file = new File("c:/Temp/Test/mid/3");
		file.mkdirs();
		file = new File("c:/Temp/Test/high/1");
		file.mkdirs();
		file = new File("c:/Temp/Test/high/2");
		file.mkdirs();
		file = new File("c:/Temp/Test/high/3");
		file.mkdirs();
	}
}
