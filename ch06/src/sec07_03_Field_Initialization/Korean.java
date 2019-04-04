package sec07_03_Field_Initialization;

//생성자에서 필드 초기화
public class Korean {
	//필드
	String nation = "대한민국";
	String name;
	String ssn;

	//생성자
//	public Korean(String n, String s) {
//		name = n;
//		ssn = s;
//	}
	public Korean(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
