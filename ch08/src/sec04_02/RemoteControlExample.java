package sec04_02;
import sec04_01.*;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = null;

		rc = new Television();
		rc.turnOn();
		rc.setMute(true);

		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
	}
}