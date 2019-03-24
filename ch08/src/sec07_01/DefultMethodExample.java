package sec07_01;

public class DefultMethodExample {
	public static void main(String[] args) {
		MyInterface mi1 = new MyClassA();
		mi1.method1();
		mi1.Method2();
		
		MyInterface mi2 = new MyClassB();
		mi2.method1();
		mi2.Method2();
	}
}
