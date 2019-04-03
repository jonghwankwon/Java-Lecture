package Practice01;

public class MemberDTO {
	private int id;
	private String passwd;
	private String name;
	private String birthday;
	private String address;
	
	MemberDTO(int id, String passwd, String name, String birthday, String address) {
		this.id = id;
		this.passwd = passwd;
		this.name = name;
		this.birthday = birthday;
		this.address = address;
	}
	MemberDTO() {}
	
	//Getter
	public int getId() {
		return id;
	}
	public String getPasswd() {
		return passwd;
	}
	public String getName() {
		return name;
	}
	public String getBirthday() {
		return birthday;
	}
	public String getAddress() {
		return address;
	}
	
	//Setter
	public void setId(int id) {
		this.id = id;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "memberDTO [id=" + id + ", passwd=" + passwd + ", name=" + name + ", birthday=" + birthday + ", address="
				+ address + "]";
	}
}
