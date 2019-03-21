package Practice5;

public class Child extends Parent {
	public int studentNo; //public -> private 변경

	//수정
	public Child(String name, int studentNo) {
		super(name);
		this.name = name;
		this.studentNo = studentNo;

//						잘못된 부분	
//		public Child(String name,int studentNo) { //자식클래스에서 부모생성자를 호출하지 않았기 때문에 컴파일 에러 발생
//		this.name = name;
//		this.studentNo = studentNo;
	}
}
