package sce02_02_Thread_Name;

public class ThreadA extends Thread {
	public ThreadA() {
		setName("ThreadA");		//스레드 이름 설정
	}
	
	public void run() {
		for(int i=0; i<2; i++) {								// ThreadA의 실행 내용
			System.out.println(getName() + "가 출력한 내용");	//스레드 이름 얻기
		}
	}
}
