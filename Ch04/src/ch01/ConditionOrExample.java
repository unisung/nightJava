package ch01;
//
// ||,| 차이는 왼쪽 값이 참이면 오른쪽 연산을 하느냐의 차이
// |는 왼쪽이 참이라도 오른쪽연산을 완료후 |연산을 함.
// ||는 왼쪽이 참이면 오른쪽 연산을 하지않음.
public class ConditionOrExample {
	public static void main(String[] args) {
		int num1 =0,num2=0;
		if(++num1 > 0 || ++num2 > 0)//num1: 0->1, num2:0->1
			System.out.println("num1이 0보다 크거나 ,num2가 0보다 큽니다");
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
		
		num1=0;
		num2=0;
		if(++num1 > 0 | ++num2 > 0)//num1: 0->1, num2:0->1
			System.out.println("num1이 0보다 크거나 ,num2가 0보다 큽니다");
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
	}
}
