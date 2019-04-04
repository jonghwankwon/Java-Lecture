package test14;

public class Person {
	private String name;
	private int id;
	private int score;

	Person(String name, int id, int score) {
		this.name = name;
		this.id = id;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public int getScore() {
		return score;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
