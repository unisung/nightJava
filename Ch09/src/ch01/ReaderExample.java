package ch01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderExample {
	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("c:\\temp\\poem.txt");
			char arr[] = new char[16];
			while(true) {
				/*int data = reader.read();//read()결과값은 잀은 char 문자 하나
				if(data==-1) break;//read()읽은 data가 있으면 값을 리턴, data가없으면 -1을 리턴
				char ch=(char)data;
				System.out.print(ch);//출력
			 */
				int data = reader.read(arr);//배열에 저장된 길이가 data변수저장.
				if(data==-1) break;//num<0;
				 for(int cnt=0;cnt<data;cnt++)
					 System.out.print(arr[cnt]);
				 System.out.println();
				
						}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
