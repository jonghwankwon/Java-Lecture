package sec05_01_TreeSet;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample3 {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("apple");
		treeSet.add("forever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");
		treeSet.add("f");
		
		System.out.println("[c~f 사이의 단어 검색]"); //↓ "c"<= 검색단어 <="f" ↓
		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);	
		for(String word : rangeSet) {
			System.out.println(word);
		}
	}
}