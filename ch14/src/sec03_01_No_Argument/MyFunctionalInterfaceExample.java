package sec03_01_No_Argument;

public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		MyFuncitionInterface fi;

		fi= () -> {
			String str = "method call1";		//익명구현객체 생성
			System.out.println(str);
		};
		fi.method();

		fi = () -> {System.out.println("method call2");		//한줄로 할 경우
		};
		fi.method();

		fi = () -> System.out.println("method call3");		//실행문이 하나라면 중괄호{}는 생략가능
		fi.method();
	}
}
