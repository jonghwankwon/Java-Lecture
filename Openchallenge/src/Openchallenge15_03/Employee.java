package Openchallenge15_03;

import java.time.LocalDate;

public class Employee implements Comparable<Employee>{
	private int emp_id;
	private String name;
	private String rank;
	private LocalDate date;

	Employee(int emp_id, String name, String rank, LocalDate date) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.rank = rank;
		this.date = date;
	}

	public int getEmp_id() { return emp_id; }
	public String getName() { return name; }
	public String getRank() { return rank; }
	public LocalDate getDate() { return date; }

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", name=" + name + ", rank=" + rank + ", date=" + date + "]";
	}

	@Override
	public int compareTo(Employee o) {
		Rank thisRk = Rank.valueOf(rank);
		Rank oRk = Rank.valueOf(o.getRank());
		
		if (thisRk.compareTo(oRk) > 0) return 1;
		if (thisRk.compareTo(oRk) < 0) return -1;
		if (date.compareTo(o.getDate()) > 0) return 1;
		if (date.compareTo(o.getDate()) < 0) return -1;
		return name.compareTo(o.getName());
	}
	
	
}
