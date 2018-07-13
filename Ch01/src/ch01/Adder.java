package ch01;

public class Adder {
	public static void main(String[] args) {
		int total=0;//명령문 - int타입의 변수를 선언하고 그 변수에 숫자 0을 대입하세요;
		for(int cnt=1;cnt<=100;cnt++) { //3개의 명령문
			//int타입의 변수를 선언하고, 변수의 값이 100보다 작거나 같을때까지,
			//변수값을 하나씩 증가하면서 아래의 명령문을 실행하세요..
			total = total+cnt;//명령문- total이라는 변수에 cnt라는 변수값을 더해서
			                  //다시 total이라는 변수에 대입하세요..
			                  //변수는 항상 값이 바뀜.
		}
		System.out.println("총합은:"+total);//명령문-문자열을 출력하라는 명령문.
		                                   //"총합은:"문자열과 total이라는 숫값을 합쳐서
		                                   //문자열 "총합은:5050"이라는 값을 출력하라는 명령문.
	}
}