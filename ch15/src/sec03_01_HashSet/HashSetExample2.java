package sec03_01_HashSet;

import java.util.*;

public class HashSetExample2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
//		set.add(new Member("홍길동", 30, "010-1234-3214"));	//인스턴스는 다르지만 내부 데이터가 
//		set.add(new Member("홍길동", 30, "010-1234-3214"));
		Member m1 = new Member("홍길동", 30, "010-1234-3214");
		Member m2 = new Member("홍길동", 30, "010-1234-3214");
		
		if (m1 == m2)
			System.out.println("== 성립");
		else
			System.out.println("!= 불성립");
		
		set.add(m1);
		set.add(m2);
		
		System.out.println("총 객체수 : " + set.size());	//저장된 객체 수 얻기
	}
}
