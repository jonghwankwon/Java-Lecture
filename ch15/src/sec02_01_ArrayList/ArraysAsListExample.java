package sec02_01_ArrayList;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("홍길동", "신용권", "김자바");
		for(String name : list1) {
			System.out.println(name);
		}
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		//추가 삭제 불가능
		//list2.remove(2);	x
		//list2.add(4)		x
		for(int value : list2){
			System.out.println(value);
		}
	}
}
