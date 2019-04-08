package sec03_02_Argument;

public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		MyFuncitionInterface fi;

		fi= (x) -> {
			int result = x * 5;
			System.out.println(result); 
		};
		fi.method(2);

		fi = (x) -> { System.out.println(x*5); };
		fi.method(2);

		fi = x -> System.out.println(x*5);		// 매개 변수가 하나일 경우에는 괄호 () 생략 가능
		fi.method(2);
	}
}
