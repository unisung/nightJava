package ch02;

import java.util.StringTokenizer;

public class StringTokenizerExample {
	public static void main(String[] args) {
		StringTokenizer stok = //stok에는 "사과","배","복숭아"
				new StringTokenizer("사과,배-복숭아|망고=살구",",-|=");
		//stok객체에 토큰이 존재할때까지 반복
        while(stok.hasMoreTokens()){
        String str=stok.nextToken();
        System.out.println(str);			
	}
   }
}
