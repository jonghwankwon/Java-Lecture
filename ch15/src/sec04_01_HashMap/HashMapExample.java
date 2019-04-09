package sec04_01_HashMap;

import java.util.*;

public class HashMapExample {
	public static void main(String[] args) {
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();

		//객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);		//"홍길동" 키가 같기 때문에 제일 마지막에 저장한 값으로 대치
		System.out.println("총 Entry 수: " + map.size());	//저장된 총 Entry 수 얻기

		//객체 찾기
		System.out.println("\t홍길동" + map.get("홍길동"));		//이름(key)으로  점수(value)를 검색
		System.out.println();

		//객체를 하나씩 처리
		Set<String> keySet = map.keySet();		//key Set 얻기
		//방법1
		/*Iterator<String> keyIterator= keySet.iterator();
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + ":" + value);*/
		//방법2
		for(String key : keySet)
			System.out.println("\t" + key + ":" + map.get(key));
		System.out.println();

		//객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수: " + map.size());

		//객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		/*Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

		//방법 1
		while(entryIterator.hasNext()) {	// 반복해서 Map.Entry를 얻고 키와 값을 얻어냄
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + ":" + value);
		}
		System.out.println();*/
		
		//advanced for loop
		for(Map.Entry<String, Integer> entry: entrySet)
			System.out.println("\t" + entry.getKey() + ":" + entry.getValue());
		System.out.println();

		
		map.clear();		//모든 Map.Entry 삭제
		System.out.println("총 Entry 수: " + map.size());
	}
}
