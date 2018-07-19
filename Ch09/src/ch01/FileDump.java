package ch01;

import java.io.FileInputStream;

public class FileDump {
	public static void main(String[] args) {
		if(args.length<1) {
			System.out.println("Usage: java FileDump < fileName >");
			return;
		}
		FileInputStream in =null;
		try {
			 in = new FileInputStream(args[0]);
			 byte arr[] = new byte[16];//길이가 16인 byte배열 생성
			 while(true) {
				 int num = in.read(arr);//byte를 읽어서 배열에 저장후 저장한 갯수를 num에 넘김
				 if(num==-1) break;//num<0;
				 for(int cnt=0;cnt<num;cnt++)
					 System.out.printf("%02x",arr[cnt]);
				 System.out.println();
			 }
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}finally {
			try {
				in.close();
			}catch(Exception e) {
				
			}
		}
	}

}
