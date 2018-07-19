package ch01;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class DataInputStreamExample1 {
	public static void main(String[] args) {
		DataInputStream in = null;
		try {
			 in = 
		new DataInputStream(new FileInputStream("c:\\temp\\output.dat"));
		 while(true) {
			 int data = in.readInt();//
			 System.out.println(data);
		 }
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
