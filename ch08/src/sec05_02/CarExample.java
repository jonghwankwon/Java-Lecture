package sec05_02;

import sec05_03.KumhoTire;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();

		myCar.frontLeftTire = new KumhoTire();
		System.out.println("------------------------");
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();
	}
}
