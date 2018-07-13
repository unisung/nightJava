package ch04;

public class IfExample {
	public static void main(String[] args) {
		//int타입의 변수 num1을 선언하고 int타입 정수 리터럴52를 num1에 대입하라는 명령문;
		int num1 = 52;
		//int타입의 변수 num2를 선언하고 int타입 정수 리터럴24를 num2에 대입하라;
		int num2 = 24;
		if(num1>num2) {//if블럭시작
			System.out.println("num1이 값이 더 큽니다.");
		    System.out.println("num1="+num1);
		    System.out.println("num2="+num2);
		}//if블럭끝. --if조건의 영향이 미치는 범위를 한정짓는 기능.
		
	}

}
