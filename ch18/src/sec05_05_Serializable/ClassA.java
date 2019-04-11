package sec05_05_Serializable;

import java.io.Serializable;

public class ClassA implements Serializable {
	int field1;
	ClassB field2 = new ClassB(); //참조변수
	static int field3;
	transient int field4;

}
