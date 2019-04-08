package day_2;
import java.util.Scanner;
public class ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//회원 관리 프로그램
		//회원 번호 이름 연락처 >string
		//회원 추가 삭제 변경 열람 CRUD (Criate read update delet)
		
		Scanner in=new Scanner(System.in);
				
	    String memberNum[]=new  String[100]; //회원번호 저장배열
		String name[]=new       String[100];
		String phone[]=new      String[100];
		String temp; //문자열 값을 잠시 담아둘 변수
		
		int sel; //메뉴 선택을 위한 변수
		int amount=0; //회원 수를 카운팅 하기위한 변수
		boolean ck=false; //중복 검사를 위한 변수
		
		while(true)
		{
			System.out.println("회원 관리 시스템");
			System.out.println("1. 회원 추가");
			System.out.println("2. 회원 삭제");
			System.out.println("3. 회원 변경");
			System.out.println("4. 회원 열람");
			System.out.println("5. 종료");
			System.out.print("실행할 기능을 입력하세요 :");
			sel=in.nextInt();
			temp=in.nextLine(); //버퍼를 비우기 위한 더미
			
			if (sel==1)//회원추가 기능
			{
				
				
				//회원추가 기능코드
				System.out.println("회원번호를 입력하세요:");
				temp=in.nextLine();//임시로 회원번호 저장
				
	            for(int i=0; i<amount; i++)//저장된 회원 숫자만큼 배열순회
				{
	            	//문자열.equals(문자열) : 두문자열이 같을경우 true
					if(temp.equals(memberNum[i]))//중복 회원번호가 있을 경우		
				    {
						ck=true; //ck 값을 변경
						break;
				    }
		        }
	            
			    if(ck)//중복값이 있을경우
			    {
			    	System.out.println("중복된 회원번호 입니다.");
			    	ck=false;//변경됐던 ck를 원상태로 돌려줌
			    }
			    
			    else //그렇지 않을 경우
			    {
			    	memberNum[amount]= temp;
					
					System.out.println("이름을 입력하세요:");
					name[amount]= in.nextLine();
					
					System.out.println("핸드폰번호를 입력하세요:");
					phone[amount]= in.nextLine();
					
					amount++;//회원수 한명 추가
			    }
			    	
			   
				
			}
			
			else if(sel==2)//회원삭제
			{
				//삭제하려는 사람의 인덱스
			}
			
			else if(sel==3)//회원변경
			{
				
			}
			
			else if(sel==4)//회원열람
			{
				System.out.println("회원번호   이름   연락처");
				for(int i=0; i<amount; i++)
				{
					System.out.println((i+1)+"."+memberNum[i]+"."+name[i]+"."+phone[i]);
				}
				
			}
			
			else if(sel==5)//종료
			{
				break;
			}
			
		 }//while문 end
		
		System.out.println("프로그램을 종료합니다");
			
			
			
			
	}

}
