package Practice13;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataPrintExample {
	public static void main(String[] args) {
		Date now = new Date();

//		SimpleDateFormat sdf = new SimpleDateFormat("2024년 05월 08일 화요일 10시 30분");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
        Date date = new Date();
        System.out.println(sdf.format(date));


	}
}
