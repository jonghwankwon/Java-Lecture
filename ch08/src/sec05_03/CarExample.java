package sec05_03;

import sec05_03.KumhoTire;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();

		myCar.run();

		myCar.tires[0] = new KumhoTire();
				System.out.println("------------------------");
		myCar.tires[1] = new KumhoTire();
				
		myCar.run();
	}
}
