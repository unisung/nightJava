package ch01;

public class LiteralExample9 {
	public static void main(String[] args) {
	 int num=10000;
	 boolean isBig;//boolean타입의 변수 isBig선언
	 if(num>100)
		 isBig=true;//boolean타입의 변수에 boolean타입 리터럴true를 대입
	 else
		 isBig=false;//boolean타입의 변수에 boolean타입 리터럴false를 대입
	 System.out.println(isBig);
	}
}
