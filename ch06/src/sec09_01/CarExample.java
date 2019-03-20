package sec09_01;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car("포르쉐");
		Car yourCar = new Car("벤츠");
		
		myCar.run();
		yourCar.run();
		System.out.println(myCar.toString());
		System.out.println(yourCar.toString());
	}

}
