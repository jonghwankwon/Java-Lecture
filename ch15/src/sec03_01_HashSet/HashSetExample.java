package sec03_01_HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("Java");			//"Java"는 한 번만 저장됨 / 중복저장 x
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");			//hashCode()와 equals값이 같음
		set.add("iBATIS");

		int size = set.size();		//저장된 객체 수 얻기
		System.out.println("총 객체 수: " + size);


		Iterator<String> iterator = set.iterator();		//반복자 얻기
		while(iterator.hasNext()) {						//객체 수 만큼 루핑
			String element = iterator.next();			//한 개의 객체를 가져온다
			System.out.println("\t" + element);
		}
		set.remove("JDBC");		//객체 삭제
		set.remove("iBATIS");

		System.out.println("총 객체 수: " + set.size());	//저장된 객체 수 얻기

		//advanced for loop사용
		for(String element : set) {
			System.out.println("\t" + element);
		}
		set.clear();	//모든 객체를 제거하고 비움
		if(set.isEmpty()) {
			System.out.println("비어 있음");	
		}

		//while 사용
		/*iterator = set.iterator();
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println("\t" + element);
		}*/
	}
}
