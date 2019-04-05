package Practice01;


public class MemberTest {
	public static void main(String[] args) {
		MemberDAO mDao = new MemberDAO();
		
		//데이터 입력
		mDao.insertMember(new MemberDTO(100001,"java", "김자바", "1998-07-12", "대전광역시 서구 월평동 이젠아카데미"));
		MemberDTO member = mDao.selectOne(1);
		System.out.println(member.toString() + "\n");
		
		//데이터 수정
		
		
		//데이터 삭제
		
		//데이터 조회
//		List<MemberDTO> memberList
		
		mDao.close();
	}
}