package Openchallenge18_05;

import java.io.*;
import java.util.StringTokenizer;
import java.util.TreeMap;
//line읽어들이기
//Tokenizer -> Map HashMap TreeMap<String, Integer>
//									word, count
//TreeSet<word>에 정보를 넣기
public class Word_Count {
	public static void main(String[] args) throws Exception {
		File file = new File("c:/Temp/Test01.txt");
		FileReader fr = new FileReader(file);
		try {
			BufferedReader br = new BufferedReader(fr);
			StringTokenizer st;
			TreeMap<String,Integer> tm = new TreeMap<String,Integer>();
			String str = null;

			while((str = br.readLine()) != null) {
				st = new StringTokenizer(str, ",. !?()");
				for(int i=1; i< st.countTokens();i++ ){
					String data = st.nextToken().replaceAll("[^a-zA-Z]","");  
					if (tm.containsKey(data)== false){
						tm.put(st.nextToken(), 1);
					}else {
						int k = tm.get(data) +1;
						tm.replace(data, k);
					}
					System.out.println(data + " >  " + i + "회" );
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
			e.printStackTrace();
		}
	}
}