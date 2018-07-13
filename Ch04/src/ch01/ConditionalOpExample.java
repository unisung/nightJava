package ch01;

public class ConditionalOpExample {
	public static void main(String[] args) {
		int a=20, b=30, max;
		//a<b 가 먼저 연산 결과는 true
		//true이면?a
		//false이면?:b;
		//max=a;
		max = a<b ? a : b;
		System.out.println("max="+max);
		
	}

}
