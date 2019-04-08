package Openchallenge14_03;

import java.util.Scanner;
import java.text.ParseException;

public class Time {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		System.out.print("시간 입력(hh:mm:ss) >");
		String currentTime = sc.nextLine();
		int hour = Integer.parseInt(currentTime.substring(0, 2));
		int min = Integer.parseInt(currentTime.substring(3, 5));
		int sec = Integer.parseInt(currentTime.substring(6));
		int now = hour * 60 * 60 + min * 60 + sec;

		System.out.println("퇴근 시간 : 18시 30분 00초 ");
		int off = 18 * 60 * 60 + 30 * 60;
		int remain = off - now;
		sec = remain % 60;
		remain /= 60;
		min = remain % 60;
		hour = remain / 60;
		System.out.println("남은 시간 : " + hour + "시간 " + min + "분 " + sec + "초");
	}
}
/*		....
		SimpleDateFormat f = new SimpleDateFormat("HH:mm:ss", Locale.KOREA);
  		Date d1 = f.parse("18:00:00");
		Date d2 = f.parse("18:30:00");
		long diff = d2.getTime() - d1.getTime();
		int hh   = (int) ((diff / (1000*60*60)) % 24);	 //시
		int mm = (int) ((diff / (1000*60)) % 60); 		 //분
		int ss = (int) (diff / 1000) % 60 ;           	 //초
		System.out.println("남은 시간 : " + hh + "시간 " + mm + "분 " + ss + "초");*/	
