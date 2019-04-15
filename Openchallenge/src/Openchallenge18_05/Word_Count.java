package Openchallenge18_05;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;
//line읽어들이기
//Tokenizer -> Map HashMap TreeMap<String, Integer>
//									word, count
//TreeSet<word>에 정보를 넣기
public class Word_Count {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		System.out.print("조회할 파일명: ");
		String filePath = scan.nextLine();
		scan.close();
		
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		String line = null;
		HashMap<String, Integer> wordMap = new HashMap<String, Integer>();

		int count = 0;
		while ((line = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(line, ",. ?!()");
			while (st.hasMoreTokens()) {
				count++;
				String word = st.nextToken();
				if (wordMap.containsKey(word)) {
					int val = wordMap.get(word);
					wordMap.put(word, val+1);
				} else {
					wordMap.put(word, 1);
				}
			}
			
			
		}
		System.out.println("총 단어수 = " + count);
		count = 0;
		TreeSet<Word> wordSet = new TreeSet<Word>();
		Set<Map.Entry<String,Integer>> wordMapSet = wordMap.entrySet();
		for (Map.Entry<String,Integer> entry : wordMapSet) {
			wordSet.add(new Word(entry.getKey(), entry.getValue()));
			count++;
		}
		System.out.println("총 단어 종류 = " + count);
		
		count = 1;
		for (Word word: wordSet) {
			System.out.println(word.toString());
			if (count++ == 10)
				break;
		}
		br.close();
		fr.close();
	}

}