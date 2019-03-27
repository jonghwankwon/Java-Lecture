package Practice03;

public class Student {
	private String studentNum;

	public Student(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {	//학생 객체인지 검사
			Student student = (Student) obj;	//학생 객체이면 타입 변환
			if(studentNum.equals(student.getStudentNum())) {	//학번 비교
				return true;	//학번이 같으면 true를 return
			}
		}
		return false;	//student객체가 아니거나 학번이 다를 경우 false를 return
	}
	// 학번에 대한 hashCode 작성
	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
}
