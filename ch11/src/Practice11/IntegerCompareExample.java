package Practice11;

public class IntegerCompareExample {
	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		System.out.println(obj1 == obj2);
		System.out.println(obj3 == obj4);
		//값의 범위가 -128~127이면, == 연산자는 값을 비교하고, 
		//그렇지 않으면 객체의 주소값을 비교하기 때문에
	}
}
