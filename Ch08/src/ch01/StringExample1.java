package ch01;

public class StringExample1 {
	public static void main(String[] args) {
		String str ="자바 커피";
		int len =str.length();//문자열의 길이 알려주는메소드
		
		for(int cnt=0;cnt<len;cnt++) {
			char ch=str.charAt(cnt);//문자열에서 index번호에 해당하는문자(char)를 알려주는메소드
			System.out.println(ch);
		}
         char ch1 = '홍';
         String str1 = "홍길동";
		if(ch1==str1.charAt(0))
			System.out.println(ch1);
		
		//char(기본데이타 타입)타입과 String(객체타입)타입은 다름
		/*if("홍"=='홍')
			System.out.println(ch1);*/
	}

}
