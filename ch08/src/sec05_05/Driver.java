package sec05_05;

import sec05_04.Vehucle;
import sec05_05.Bus;

public class Driver {
	public void drive(Vehucle vehucle) {
		if(vehucle instanceof Bus) {
			Bus bus = (Bus) vehucle;
			bus.checkFare();
		}
		vehucle.run();
	}
}
