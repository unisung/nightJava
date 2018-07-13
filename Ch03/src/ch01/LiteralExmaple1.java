package ch01;

public class LiteralExmaple1 {
	public static void main(String[] args) {
		float num;//float타입의 변수 선언
		num=(float)12.34;//double타입의 리터럴 12.34를 float타입의 변수에 대입
		System.out.println(num);
		
		float num2;//float타입의 변수 선언
		num=12.34F;//소수점숫자뒤에 f(F)를 붙이면 자바는 이 숫자를 float타입의 리터럴로 인식
		System.out.println(num);

	}

}
