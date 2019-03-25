package sec02_01;

public class NullPointerExceptionExample {
	public static void main(String[] args) {
		String data = null;
		System.out.println(data.toString()); //객체가 없는 상태에서 객체를 사용하려고 했음
	}
}
