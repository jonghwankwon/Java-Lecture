package sec07_02;

public interface ChildInterface3 extends ParentInterface {

	@Override
	default void method1() {
		//실행문
	}
	@Override
	default void method2() {
		//실행문
	}
 
}
