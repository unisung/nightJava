package ch03;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class DateFormatExample1 {
	public static void main(String[] args) {
		GregorianCalendar calendar = new GregorianCalendar();
		SimpleDateFormat sdf 
		    = new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시mm분ss초(E)");
		
        String str = sdf.format(calendar.getTime());
        System.out.println(str);
        

	}

}
