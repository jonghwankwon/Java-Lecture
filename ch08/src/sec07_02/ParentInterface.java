package sec07_02;

public interface ParentInterface {
	public abstract void method1();
	public default void method2() { 
		System.out.println("");}
}
