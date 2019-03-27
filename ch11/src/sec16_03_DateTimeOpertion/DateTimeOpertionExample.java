package sec16_03_DateTimeOpertion;

import java.time.LocalDateTime;

//날짜와 시간 연산
public class DateTimeOpertionExample {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println("현재시 : " + now);
		
		LocalDateTime targetDateTime = now
				.plusYears(1)
				.minusMonths(2)
				.plusDays(3)
				.plusHours(4)
				.minusMinutes(5)
				.plusSeconds(6);
		System.out.println("연산후 : " + targetDateTime);
	}
}
