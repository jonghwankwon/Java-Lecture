package sec05_05_Serializable;

import java.io.Serializable;

public class ClassC implements Serializable {
	static final long serilaVersionUID = 1000L;	// 클래스의 수정이 필요할 때 명시적으로 선언
	int field1;
//	int field2;	//추가 후 예외가 발생하면 6번라인을 작성
}
