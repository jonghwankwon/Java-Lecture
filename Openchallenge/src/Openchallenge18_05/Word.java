package Openchallenge18_05;

import java.util.Comparator;
import java.util.Map;

public class Word  implements Comparable<Word> {
	private String word;
	private int count;

	public Word() {}
	
	Word(String word, int count) {
		this.word = word;
		this.count = count;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public int compareTo(Word o) {
		if(count < o.getCount())return 1;
		if(count > o.getCount())return -1;
		return compareTo(o);
	}
}
