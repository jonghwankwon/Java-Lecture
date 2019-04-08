package Openchallenge14_02;

public class MemberApp {
	public static void main(String[] args) {
		Member m1 = new Member("홍길동", "hong", "1q2w3e4r", 29);
		Member m2 = new Member("김두한", "doohan", "doohan12", 21);
		Member m3 = new Member("각시탈", "tal", "taltal", 31);
		Member m4 = new Member("구준표", "koo", "kookoo", 29);
		
		System.out.println(m1.compareTo(m2));
		System.out.println(m1.compareTo(m3));
		System.out.println(m1.compareTo(m4));
	}
}