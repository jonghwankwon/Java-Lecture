package sec05_03_Comparable;

import java.util.Objects;

public class Person implements Comparable<Person> {
	//필드변수
	public String name;
	public int age;

	//생성자
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}


	@Override
	public int compareTo(Person o) {
		if(age < o.age)
			return -1;
		else if(age == o.age) 
			return 0;
		else return 1;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person) {
			Person person = (Person) obj;
			return (age == person.age) && (name.equals(person.name));
		}else {
			return false;
		}
	}
}

