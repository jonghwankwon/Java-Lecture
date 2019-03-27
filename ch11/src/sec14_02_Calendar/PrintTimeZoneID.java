package sec14_02_Calendar;

import java.util.Calendar;
import java.util.TimeZone;

//사용 가능한 시간대 문자열 출력
public class PrintTimeZoneID {
	public static void main(String[] args) {
		String[] availableIDs = TimeZone.getAvailableIDs();
		for(String id : availableIDs) {
			System.out.println(id);
		}
		
		TimeZone tz = TimeZone.getTimeZone("Australia/Melbourne");
		Calendar nowMelbourne = Calendar.getInstance(tz);
		System.out.print(nowMelbourne.get(Calendar.MONTH) +1 + "월 ");
		System.out.print(nowMelbourne.get(Calendar.DAY_OF_MONTH) + "일 ");
		System.out.print(nowMelbourne.get(Calendar.HOUR) + "시 ");
		System.out.println(nowMelbourne.get(Calendar.MINUTE) + "분 ");
		
	}
}
