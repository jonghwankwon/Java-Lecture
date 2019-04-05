package sce02_01_Create_Thread;

import java.awt.Toolkit;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		//방법1
		/*Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		}*/


		//방법2 익명 구현 객체
		/*Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0; i<5; i++) {
					toolkit.beep();
					try {Thread.sleep(500);	}catch (Exception e) {}
				}
			}
		});*/

		//방법3 람다식 이용
		Thread thread = new Thread(() -> {
			Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i=0; i<5; i++) {
				System.out.println("띵");
				try {Thread.sleep(500);	}catch (Exception e) {}
			}
		});

		thread.start();

		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500); }
			catch (Exception e) { }
		}
	}	
}
