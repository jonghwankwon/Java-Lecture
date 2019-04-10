package Openchallenge15_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class NamesSortExample {
	public static void main(String[] args) {
		String str = "이유덕,이재영,권종표,이재영,박민호,강상희,이재영,김지완,최승혁,이성연,박영서,박민호,전경헌,송정환,김재성,이유덕,전경헌";
		String [] nameArr = str.split(","); 

		System.out.println("1. 김씨와 이씨는 각각 몇 명인가요?");
		int Kim = 0, Lee = 0, Ljy= 0;
		for (int i=0; i<nameArr.length; i++) {
			if (nameArr[i].startsWith("김")) {
				Kim++;
			} 
			if (nameArr[i].startsWith("이")) {
				Lee++;
			} 
			if (nameArr[i].equals("이재영")) {
				Ljy++;
			}
		}
		System.out.println("   >> 김씨 : " + Kim + "명");     
		System.out.println("   >> 이씨 : " + Lee + "명");     

		System.out.println("2. 이재영 이름이 몇 번 반복되나요?");
		System.out.println("   >> " + Ljy + "번");

		System.out.println("3. 중복을 제거한 이름을 출력하세요.");
		ArrayList<String> list = new ArrayList<String>();
		for (int i=0; i<nameArr.length; i++) {
			if (list.contains(nameArr[i])) {
				continue;
			} else {
				list.add(nameArr[i]);
			}
		}
		System.out.print("   >> ");
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();

		System.out.println("4. 중복을 제거한 이름을 오름차순으로 정렬하여 출력하세요.");
		System.out.print("   >> ");
		Collections.sort(list);
		for (int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}
}