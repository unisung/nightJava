package ch03;

import java.util.Calendar;
import java.util.GregorianCalendar;
//칼렌다 정보를 가진객체 Calendar
public class CalendarExample1 {
	public static void main(String[] args) {
		GregorianCalendar cal = new GregorianCalendar();
		int year = cal.get(cal.YEAR);
		int month =cal.get(cal.MONTH)+1;
		int date = cal.get(cal.DATE);
		int amPm = cal.get(cal.AM_PM);
		int hour = cal.get(cal.HOUR);
		int min = cal.get(cal.MINUTE);
		int sec = cal.get(cal.SECOND);
		String sAmPm = (amPm==Calendar.AM)?"오전":"오후";
		System.out.printf("%d년 %d월 %d일 %s %d시 %d분 %d초",
				           year,month,date,sAmPm,hour,min,sec);
		
		

	}

}
