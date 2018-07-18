package ch01;

public class StringExample2 {
	public static void main(String[] args) {
		//"자바"리터럴 하나로 공유
		String str1 = "자바";
		String str2 = "자바";
		if(str1==str2)
			System.out.println("같음");
		else
			System.out.println("다름");
		
		//new String() ,"자바" 문자열은 리터럴,컴파일 후 new String("자바")처럼 객체가됨.
		String str3 = new String("자바");//객체생성
		String str4 = new String("자바");//객체생성
		
		if(str3==str4)
			System.out.println("같음");
		else
		    System.out.println("다름");
		//문자열의 내용비교
		if(str3.equals(str4))
			System.out.println("같음");
		else
			System.out.println("다름");
		
		//문자열 추출 메솓                        //0   1  2 3  4   5  6  7 8  9
		String str = "뇌를 자극하는 자바";//[뇌][를][][자][극][하][는][][자][바]
		System.out.println(str.substring(3));//index번호 3부터 끝까지
		System.out.println(str.subSequence(3, 6));// 시작<= 범위 < 끝
		System.out.println(str.substring(3, 6));// 시작<= 범위 < 끝
		String str5 ="  Let it be. ";
		String str6 = str5.trim();//문자열 앞뒤의 비공백 없애기
		System.out.println(str6);
		System.out.println(str6.concat(" Speaking words of wisdom"));
		System.out.println(str6.toUpperCase());
		System.out.println(str6.toLowerCase());
		System.out.println(str6.replace('e', 'a'));
		
		
		
		
		
		

	}

}
