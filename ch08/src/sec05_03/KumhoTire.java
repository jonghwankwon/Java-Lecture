package sec05_03;

public class KumhoTire implements Tire, sec05_02.Tire{
	@Override
	public void roll() {
		System.out.println("금호 타이어가 굴러갑니다.");
	}

}
