package ch01;

public class BooleanExample {
	public static void main(String[] args) {
		int num=10+20;
		boolean truth;//boolean타입 변수 선언
		truth = num>10;//boolean타입의 변수에 조건식의 결과 대입
		if(truth) {//if(조건) 조건이 참이면 truth==true
			System.out.println("계산 결과가 10보다 큽니다.");
		}
	}

}
