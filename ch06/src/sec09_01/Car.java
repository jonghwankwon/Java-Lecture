package sec09_01;

public class Car {
		//
		String model;
		int speed;
		
		//
		Car(String model){
			this.model = model;
		}
	//
	void setSpeed(int speed) {
		this.speed = speed;
	}
	void run() {
		for(int i=0; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달랍니다.(시속:" + this.speed + "km/h)");
		}
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", speed=" + speed + "]";
	}

}
