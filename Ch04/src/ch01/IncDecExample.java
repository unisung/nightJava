package ch01;

public class IncDecExample {
	public static void main(String[] args) {
		//1씩 증가/감소 연산자
		int num1 = 0,num2=0,num3=0,num4=0;
		int num5=0;
		num5++;
		System.out.println(num5);
		++num5;
		System.out.println(num5);
		
		int result1=num1++;//변수++ 연산에 참여후 1증가
		System.out.println("result1="+result1);
		System.out.println("num1="+num1);
		int result2=num2--;//연산에 참여후 1감소
		System.out.println("result2="+result2);
		System.out.println("num2="+num2);
		int result3=++num3;//1증가후 연산에 참여
		System.out.println("result3="+result3);
		System.out.println("num3="+num3);
		int result4=--num4;//1감소후 연산에 참여
		System.out.println("result4="+result4);
		System.out.println("num4="+num4);

	}

}
