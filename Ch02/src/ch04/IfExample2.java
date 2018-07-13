package ch04;

public class IfExample2 {
	public static void main(String[] args) {
		//int타입 변수num1을 선언하고 int타입 리터럴12를 대입하라.
		int num1 =12;
		//int타입 변수num2를 선언하고 int타입 리터럴24를 대입하라.
		int num2 =24;
		if(num1>num2)//num1이 num2보다 큰경우
			System.out.println("num1="+num1);
		else//num1이 num2보다 작은 경우
			System.out.println("num2="+num2);
		System.out.println("Done.");//if~else문과는 무관한 명령문;

	}

}
