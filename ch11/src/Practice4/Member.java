package Practice4;

public class Member {
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
// 재정의
	@Override
	public String toString() {
		return id + ": " + name;
	}
	
	
}
