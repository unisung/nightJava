package ch01;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ObjectInputStreamExample1 {
	public static void main(String[] args) {
		ObjectInputStream in=null;
		try {
			 in = new ObjectInputStream(
					  new FileInputStream("c:\\temp\\objOutput.dat"));
			 while(true) {
				 /*GregorianCalendar calendar 
				           =(GregorianCalendar)in.readObject();
				 int year = calendar.get(Calendar.YEAR);
				 int month = calendar.get(Calendar.MONTH)+1;
				 int date = calendar.get(calendar.DATE);
				 System.out.println(year+"/"+month+"/"+date);*/
				 Student student = (Student)in.readObject();
				 System.out.println(student.name+":"+student.no);
			 }
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
