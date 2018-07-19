package ch01;

import java.io.FileWriter;

public class FieWriterExample {
	public static void main(String[] args) {
		FileWriter writer = null;
		try {
			 writer = new FileWriter("c:\\temp\\output.txt");
			 char arr[]= {'뇌','를','자','극','하','는','j','a','v','a'};
			 for(int cnt=0;cnt<arr.length;cnt++)
				 writer.write(arr[cnt]);
			 System.out.println("완료");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				writer.close();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
