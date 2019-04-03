package sec03_05_deep_clone;

import java.util.Arrays;

public class Member implements Cloneable{
	public String name;
	public int age;
	public int[] score;
	public Car car;

	Member(String name, int age, int[] score, Car car) {
		this.name = name;
		this.age = age;
		this.score = score;
		this.car = car;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 먼저 얕은 복사를 해서 name, age를 복제한다.
		Member cloned = (Member) super.clone();
		//score를 깊은 복제한다.
		cloned.score = Arrays.copyOf(this.score, this.score.length);
		//car를 깊은 복제한다.
		cloned.car = new Car(this.car.model);
		//깊은 복제된 Member 객체를 리턴
		return cloned;
	}

	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}

}
