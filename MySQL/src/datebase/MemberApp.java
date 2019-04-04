package Practice01;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import Practice01.MemberDAO;
import Practice01.MemberDTO;

public class MemberApp {
	private static String[] accountArray = new String[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;

		while(run) { 
			System.out.println("-------------------------------------------------------");
			System.out.println("1.가입 | 2.정보 | 3.변경 | 4.삭제 | 5.검색 | 6. 종료");
			System.out.println("-------------------------------------------------------");
			System.out.print("선택> ");
			try {

				int selectNo = scanner.nextInt();
				if(selectNo == 1) {
					join();
				}else if(selectNo == 2) {
					lookup();
				}else if(selectNo == 3) {
					change();
				}else if(selectNo == 4) {
					delete();
				}else if(selectNo == 5) {
					search();
				}else if(selectNo == 6) {
					run = false;
				}
			}catch (InputMismatchException e) {

			}
		}
		System.out.println("프로그램 종료");
	}

	//가입
	private static void join(){
		MemberDAO mDao = new MemberDAO();
		MemberDTO mDto = new MemberDTO();

		System.out.println("----------");
		System.out.println("회원가입");
		System.out.println("----------");

		System.out.print("비밀번호 설정 : ");
		String passwd = scanner.next();
		mDto.setPasswd(passwd);

		System.out.print("이름 입력 : ");
		String name = scanner.next();
		mDto.setName(name);

		System.out.print("생년월일 입력 : ");
		String birthday = scanner.next();
		mDto.setBirthday(birthday);

		System.out.print("주소 입력 : ");
		String address = scanner.next();
		mDto.setAddress(address);


		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i]==null) {
				accountArray[i] = mDto.toString();
				System.out.println("결과");
				mDao.insertMember(mDto);
				break;
			}
		}
	}

	//정보
	private static void lookup(){
		MemberDAO mDao = new MemberDAO();
		MemberDTO mDto = new MemberDTO();

		System.out.println("----------");
		System.out.println("회원정보");
		System.out.println("----------");


		System.out.print("찾을 아이디를 입력하세요. : ");
		int id = scanner.nextInt();

		mDto = mDao.selectOne(id);
		System.out.println("비밀번호 : "+mDto.getPasswd());
		System.out.println("이름 : "+mDto.getName());
		System.out.println("생년월일 : "+mDto.getBirthday());
		System.out.println("주소 : "+mDto.getAddress());
	}

	//수정
	private static void change(){
		MemberDAO mDao = new MemberDAO();
		MemberDTO mDto = new MemberDTO();

		System.out.println("----------");
		System.out.println("회원정보수정");
		System.out.println("----------");


		System.out.print("수정할 아이디를 입력하세요. : ");
		int id = scanner.nextInt();
		mDto.setId(id);

		System.out.print("변경할 비밀번호를 입력하세요. : ");
		String passwd = scanner.next();
		mDto.setPasswd(passwd);

		System.out.print("변경할 이름을 입력하세요. : ");
		String name = scanner.next();
		mDto.setName(name);

		System.out.print("변경할 생년월일을 입력하세요. : ");
		String birth = scanner.next();
		mDto.setBirthday(birth);

		System.out.print("변경할 주소를 입력하세요. : ");
		String address = scanner.next();
		mDto.setAddress(address);

		mDao.updateMember(mDto);
		System.out.println("변경되었습니다.");
	}

	//탈퇴
	private static void delete(){
		MemberDAO mDao = new MemberDAO();
		//		MemberDTO mDto = new MemberDTO();

		System.out.println("----------");
		System.out.println("회원정보수정");
		System.out.println("----------");

		System.out.print("삭제할 아이디를 입력하세요. : ");
		int id = scanner.nextInt();

		mDao.deleteMember(id);
		System.out.println("삭제되었습니다.");
	}

	//검색
	private static void search(){
		List<MemberDTO> list = new ArrayList<MemberDTO>();
		MemberDAO mDao = new MemberDAO();

		System.out.println("----------");
		System.out.println("회원검색");
		System.out.println("----------");
		System.out.println("-------------------------------------------------------");
		System.out.println("1.아이디 | 2.이름 | 3.생년월일 | 4.주소");
		System.out.println("-------------------------------------------------------");
		System.out.print("선택> ");

		int selectNo = scanner.nextInt();

		if(selectNo == 1) {
			System.out.print("검색할 아이디 입력");
			int id = scanner.nextInt();
			list = mDao.selectMembersById(id);

		}else if(selectNo == 2) {
			System.out.print("검색할 이름 입력");
			String searchKeyword = scanner.next();
			list = mDao.selectMembersByName(searchKeyword);

		}else if(selectNo == 3) {
			System.out.print("검색할 생년월일 입력");
			String searchKeyword = scanner.next();
			list = mDao.selectMembersByBrithday(searchKeyword);

		}else if(selectNo == 4) {
			System.out.print("검색할 주소 입력");
			String searchKeyword = scanner.next();
			list = mDao.selectMembersByAddress(searchKeyword);
		}

		System.out.println("검색 결과");
		System.out.print("| id |");
		System.out.print("| passwd |");
		System.out.print("| name |");
		System.out.print("| birthday |");
		System.out.println("| address |");

		for(int i=0; i < list.size()-1; i++){
			System.out.print("|"+list.get(i).getId()+"|");
			System.out.print("|"+list.get(i).getPasswd()+"|");
			System.out.print("|"+list.get(i).getName()+"|");
			System.out.print("|"+list.get(i).getBirthday()+"|");
			System.out.println("|"+list.get(i).getAddress()+"|");
		}

		System.out.println();
	}
}