package ch01;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStreamExample1 {
	public static void main(String[] args) {
		DataOutputStream out=null;
		try {
			
			out = 
	  new DataOutputStream(new FileOutputStream("c:\\temp\\output.dat"));
			int arr[] = {0,1,2,3,4,5,6,7,8,9};
			for(int cnt=0;cnt<arr.length;cnt++)
				out.writeInt(arr[cnt]);
			System.out.println("완료");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				out.close();
			}catch(Exception e) {
				
			}
		}

	}

}
