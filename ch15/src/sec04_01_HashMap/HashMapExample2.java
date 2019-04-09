package sec04_01_HashMap;

import java.util.*;

public class HashMapExample2 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		Student s = new Student(20011234, "홍길동");
		
		map.put(new Student(20011234, "홍길동"), 95);	//학번과 이름이 동일한 Student를 키로 저장
		System.out.println("value = " + map.get(s));	//value = 95 출력
		map.put(s, 90);	//키값이 같기때문에 총 Entry 수 : 1
		
		System.out.println("총 Entry 수: " + map.size());		//저장된 총 Map.Entry 수 얻기
		System.out.println("value = " + map.get(s));	//value = 90 출력
		
		//키가 같으면 값을 업데이트
	}
}
