package sce02_02_Thread_Name;

public class ThreadB extends Thread{
	public void run() {
		for(int i=0; i<2; i++) {								// ThreadB의 실행 내용
			System.out.println(getName() + "가 출력한 내용");	//스레드 이름 얻기
		}
	}
}
