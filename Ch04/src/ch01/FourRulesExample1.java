package ch01;

public class FourRulesExample1 {
	public static void main(String[] args) {
	  int num1 = 1/2 -3;// 나누기 연산자 먼저 처리
	  double num2 = 2.0 + 1.5 * 2.0;//곱하기 연산자 먼저 처리
	  int num3 = 10/3/2;//왼쪽에서 오른쪽 순으로 처리
	  int num4 = 2*5 /2;//왼쪽에서 오른쪽 순으로 처리
	  System.out.println(num1);
	  System.out.println(num2);
	  System.out.println(num3);
	  System.out.println(num4);

	}

}
