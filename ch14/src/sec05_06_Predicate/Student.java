package sec05_06_Predicate;

public class Student {
	private String name;
	private String sex;
	private int score;
	
	Student(String name, String sex, int score) {
		super();
		this.name = name;
		this.sex = sex;
		this.score = score;
	}
	public String getSex() {
		return sex;
	}
	public int getScore() {
		return score;
	}
	
	
	
}
