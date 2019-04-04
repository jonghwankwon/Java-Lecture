package test14;

/*조건에 맞는 클래스 작성
1)Person 클래스를 상속 받음
2)id(int), name(String), score(int) 필드를 가지고 있음(단, private 접근 제한)
3) id, name, score 값을 받아 Student 객체를 생성시키는 생성자를 가지고 있음.(다른생성자없음)
4)id, name, score에 대한 getter 메소드만 가지고 있음 (setter없음)
5)id와 name이 같으면 hashcode 값이 같도록 할 것  
 */
public class Student extends Person {
	Student(String name, int id, int score) {
		super(name, id, score);
	}
}