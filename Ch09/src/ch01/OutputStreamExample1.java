package ch01;

import java.io.FileOutputStream;

public class OutputStreamExample1 {
	public static void main(String[] args) {
		FileOutputStream out =null;
		try {
			//FileOutputStream객체가 open됨.
			out = new FileOutputStream("ouput.dat");
			byte arr[] = {1,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
			for(int cnt=0;cnt<arr.length;cnt++)
				out.write(arr[cnt]);
		}catch(Exception e ) {
			
		}finally {
			try {
				out.close();//자원해제
			}catch(Exception e) {
				
			}
		}
		
	}

}
