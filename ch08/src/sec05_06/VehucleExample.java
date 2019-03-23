package sec05_06;

import sec05_05.Bus;
import sec05_05.Vehucle;

public class VehucleExample {
	public static void main(String[] args) {
		Vehucle vehucle = new Bus();
		
		vehucle.run();
		//vehucle.checkFare(); //(x) vehucle인터페이스에는 checkFare()가 없음

		Bus bus = (Bus) vehucle; //강제 타입 변환
		
		bus.run();
		bus.checkFare(); //Bus 클래스에는 checkFare()가 있음
	}
}
