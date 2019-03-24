package sec07_02;

public interface ChildInterface2 extends ParentInterface{

	@Override
	default void method2() {
		System.out.println("");
	}
	public abstract void method3();

}

