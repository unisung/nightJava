package ch01;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;

public class ObjectOutputExample {
	public static void main(String[] args) {
		 ObjectOutputStream out=null;
		 try {
			 out = new ObjectOutputStream(
					 new FileOutputStream("c:\\temp\\objOutput.dat"));
			/* out.writeObject(new GregorianCalendar(2018,7,14));
			 out.writeObject(new GregorianCalendar(2018,7,15));
			 out.writeObject(new GregorianCalendar(2018,7,16));*/
			  out.writeObject(new Student("홍길동", "1010"));
			  out.writeObject(new Student("일지매", "1011"));
			  System.out.println("완료");
			 
		 }catch(Exception e) {
			 e.printStackTrace();
			 System.out.println(e.getMessage());
		 }
	}

}
