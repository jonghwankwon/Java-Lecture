package ClassEx;

public class StudentScore {
	// 1. 필드 생성
	private String name;
	private int math;
	private	int english;
	private	int science;
	private	double avg;

	// 2. 성명과 수학, 영어, 과학 점수를 매개변수로 하는 생성자를 작성
	public StudentScore(String name,int math,int english,int science) {
		this.name = name;
		this.math = math;
		this.english = english;
		this.science = science;
	}

	// 4.평균을 구하는 메소드(double average()) 생성
	double average() {
		
		int sum = this.math + this.english + this.science;
		double avg = (double)sum / 3;
		this.avg = avg;
		return avg;
	}
	
	//3. toString() 메소드 생성 (우클릭-> source -> generate toString()클릭)
	@Override
	public String toString() {
		return "StudentScore [name=" + name + ", math=" + math + ", english=" + english + ", science=" + science
				+ ", avg=" + String.format("%.2f", avg) + "]";
	}
}
