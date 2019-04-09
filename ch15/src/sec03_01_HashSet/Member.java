package sec03_01_HashSet;

import java.util.Objects;

public class Member {
	public String name;
	public int age;
	public String tel;
	
	Member(String name, int age, String tel) {
		this.name = name;
		this.age = age;
		this.tel = tel;
	}

	@Override
	public boolean equals(Object obj) {		//name과 age 값이 같으면 true를 리턴
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return member.name.equals(name);
//			return member.name.equals(name) && (member.tel == tel); 
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {		//name과 age값이 같으면 동일한 hashCode가 리턴
		return Objects.hash(tel);
//		return Objects.hash(name, age);
//		return name.hashCode() + tel.hashCode();	//name과 tel 값이 같으면 ==
	}		//String의 hashCode()이용

}
