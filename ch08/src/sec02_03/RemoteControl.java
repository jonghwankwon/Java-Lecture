package sec02_03;

public interface RemoteControl {
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;

	//추상메소드
	public void turnOn();
	public void turnOff();
	public abstract void setVolume(int volume); //abstract 추상메소드 선언
}
