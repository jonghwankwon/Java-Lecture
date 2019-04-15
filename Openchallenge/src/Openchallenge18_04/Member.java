package Openchallenge18_04;

public class Member implements Comparable<Member> {
	private String name;
	private String email;
	private String tel;

	private Member() {}

	public static Member getInstance() {
		return new Member();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(!(email.contains("@") &&(email.contains(".com")))) {
		this.email = email;
	}else
		this.email = email;
}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		if(!(tel.contains("-")&&(tel.length()>12 && tel.length()<14))) {
			this.tel = null;
		}else {
			this.tel = tel;
		}
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", email=" + email + ", tel=" + tel + "]";
	}

	@Override
	public int compareTo(Member o) {
		if(name.compareTo(o.getName()) == 0) {
			if(tel.compareTo(o.getTel()) == 0) {
				return 0;
			}else {
				return tel.compareTo(o.getTel());
			}
		}else {
			return name.compareTo(o.getName());
		}
	}


}