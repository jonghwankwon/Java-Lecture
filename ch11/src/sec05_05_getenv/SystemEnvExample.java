package sec05_05_getenv;

import java.util.Map;

//JAVA_HOME 환경 변수 값 얻기
public class SystemEnvExample {
	public static void main(String[] args) {
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println("JAVA_HOME: " + javaHome);
		
		for(Map.Entry entry: System.getenv().entrySet())
			System.out.println(entry.getKey() + "=" + entry.getValue());
	}
}
