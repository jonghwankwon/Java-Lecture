package sec03_01_equals;

public class Member {

	public String id;
	
	public Member(String id) {
		this.id = id;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {			// 매개값이 Member타입인지 확인
			Member member = (Member) obj;	// Member타입으로 강제 타입변환하고
			if(id.equals(member.id)) {		// id 필드값이 동일한지 검사한 후,
				return true;				// 동일하다면 true
			}
		}
		return false;	//매개값이 Member 타입이 아니거나 id 필드값이 다른 경우 false를 리턴
	}


	@Override
	public int hashCode() {
		return id.hashCode();
	}
	
}
