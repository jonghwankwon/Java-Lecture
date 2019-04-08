package sec05_01_Runnable;

public class RunnalbleExample {
	public static void main(String[] args) {
		Runnable runnable = () -> {		//람다식(스레드가 실행하는 코드)	5~9라인ㅁ
			for (int i=0; i<10; i++) {
				System.out.println(i);
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
	}
}