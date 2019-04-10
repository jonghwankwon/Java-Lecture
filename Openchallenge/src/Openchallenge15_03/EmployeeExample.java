package Openchallenge15_03;

import java.time.LocalDate;
import java.util.TreeSet;

public class EmployeeExample {
	public static void main(String[] args) {
		TreeSet<Employee> treeSet = new TreeSet<Employee>();

		treeSet.add(new Employee(1, "홍길동", "부장", LocalDate.of(1994, 03, 02)));
		treeSet.add(new Employee(2, "양의지", "부장", LocalDate.of(1992, 05, 12)));
		treeSet.add(new Employee(3, "홍두께", "차장", LocalDate.of(1997, 11, 22)));
		treeSet.add(new Employee(4, "이하니", "차장", LocalDate.of(1998, 04, 23)));
		treeSet.add(new Employee(5, "박민수", "과장", LocalDate.of(2001, 10, 16)));
		treeSet.add(new Employee(6, "김종환", "과장", LocalDate.of(2001, 07, 19)));
		treeSet.add(new Employee(7, "김민수", "대리", LocalDate.of(2002, 06, 13)));
		treeSet.add(new Employee(8, "박성원", "대리", LocalDate.of(2004, 01, 14)));
		treeSet.add(new Employee(9, "이종범", "사원", LocalDate.of(2007, 05, 11)));
		treeSet.add(new Employee(10, "이용규", "사원", LocalDate.of(2009, 12, 30)));

		//
		for(Employee emp : treeSet)
			System.out.println(emp.toString());
	}
}
