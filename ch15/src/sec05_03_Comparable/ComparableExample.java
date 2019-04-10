package sec05_03_Comparable;

//import java.util.Iterator;	//방법2 사용할때
import java.util.TreeSet;

public class ComparableExample {
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<Person>();
//		HashSet<Person> hashSet = new HashSet<Person>();
		
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("김자바", 25));
		treeSet.add(new Person("박지원", 31));
		treeSet.add(new Person("홍길동", 25));
		//TreeSet : 같은 값은 들어가지않음

		//방법 1
		for(Person person: treeSet)
			System.out.println(person.name + ":" + person.age);
		
		//방법 2
		/*Iterator<Person> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + ":" + person.age);
		}*/
	}
}
