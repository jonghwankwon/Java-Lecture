package Practice15;

public class MemberService {
	boolean longin(String id, String password) {
		if(id == "hong" && password == "12345") return true;
		else return false;
	}	
	void logout(String id) {
		if(id == "hong")
			System.out.println("로그아웃 되었습니다.");
	}
}
