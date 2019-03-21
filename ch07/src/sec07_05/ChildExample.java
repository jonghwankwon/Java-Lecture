package sec07_05;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.feild1 = "data1";
		parent.method1();
		parent.method2();
		/*
		 parent.feild2 = "data2";
		 parent.method3();
		 */

		Child child = (Child) parent;
		child.feild1 = "yyy";
		child.method3();
	}
}
