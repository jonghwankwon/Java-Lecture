package sec13_03.package1;

public class A {
	//필드
	public int field1;			//public 접근 제한
	int field2;					//defult 접근 제한
	private int field3;			//private 접근 제한
	
	//생성자
		//클래스 내부일 경우 접근 제한자의 영향을 받지 않는다.
	public A() {
	field1 = 1;
	field2 = 1;
	field3 = 1;
	
	method1();
	method2();
	method3();
}
	//메소드
	public void method1() {}	//public 접근 제한
	void method2() {}			//defult 접근 제한
	private void method3() {}	//private 접근 제한
}
