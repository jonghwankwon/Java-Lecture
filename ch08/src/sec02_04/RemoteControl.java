package sec02_04;

interface RemoteControl {
	//상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;

	//추상메소드
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume); //abstract 추상메소드 선언

	//디폴트 메소드
	public default void setMute(boolean mute) {	//default 앞에 public를 작성할 것
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
}
