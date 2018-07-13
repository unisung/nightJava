package ch01;

public class AssignExample3 {
	public static void main(String[] args) {
		int num1, num2;
		num2 = (num1=10);//괄호연산자() 우선순위가 가장높은 연산자,num1에 10을 대입 후
		                 //결과 값을 다시 num2에 대입
		System.out.println(num2);
		System.out.println(num1);

	}

}
