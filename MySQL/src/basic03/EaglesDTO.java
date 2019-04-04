package basic03;

public class EaglesDTO {
	private int no;
	private int backNo;
	private String name;
	private String position;
	private String hs;
	private String hand;
	private String birth;
	private int salary;
	
	EaglesDTO(int no,int backNo, String name, String position, String hs, String hand, String birth, int salary) {
		this.no = no;
		this.backNo = backNo;
		this.name = name;
		this.position = position;
		this.hs = hs;
		this.hand = hand;
		this.birth = birth;
		this.salary = salary;
	}
	EaglesDTO() {}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getBackNo() {
		return backNo;
	}
	public String getName() {
		return name;
	}
	public String getPosition() {
		return position;
	}
	public String getHs() {
		return hs;
	}
	public String getHand() {
		return hand;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setBackNo(int backNo) {
		this.backNo = backNo;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	public void setHs(String hs) {
		this.hs = hs;
	}
	public void setHand(String hand) {
		this.hand = hand;
	}
	
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "EaglesDTO [backNo=" + backNo + ", name=" + name + ", position=" + position + ", hs=" + hs + ", hand="
				+ hand + ", birth=" + birth + ", salary=" + salary +"만원]";
	}
	
	
}
