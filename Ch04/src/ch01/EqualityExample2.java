package ch01;

public class EqualityExample2 {
	public static void main(String[] args) {
		double num1 = 1.1 + 2.2;//연산의 결과를 대입
		double num2 = 3.3;//리터럴값
		
		if(num1==num2) {
			System.out.println("같음");
			System.out.println("num1="+num1);
			System.out.println("num2="+num2);
		}
		if(num1 !=num2) {
			System.out.println("다름");
			System.out.println("num1="+num1);
			System.out.println("num2="+num2);
		}
	}

}
