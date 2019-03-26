package sec05_03_currentTimeMillis_and_nanoTime;

//프로그램 실행 소요 시간 구하기
public class SystemTimeExample {
	public static void main(String[] args) {
		long time1 = System.nanoTime();				//시작 시간 읽기
		
		int sum = 0;
		for(int i=1; i<=1000000; i++) {
			sum += i;
		}
		long time2 = System.currentTimeMillis();	//끝 시간 읽기
		
		System.out.println("1~10000000까지의 합 : " + sum);
		System.out.println("계산에 " + (time2-time1) + " 나노초가 소요되었습니다.");
	}
}