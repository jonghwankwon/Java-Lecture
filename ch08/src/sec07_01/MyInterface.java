package sec07_01;

public interface MyInterface {
	public void method1();
	
	//수정 인터페이스
	public default void Method2() {
		System.out.println("MyInterface-method2 실행");
	}
}
