package ch01;

public class LogicalExample {
	public static void main(String[] args) {
		int a=3,b=4,c=3,d=5;
		//논리연산 바향 (->),괄호가 있으면 먼저 계산()
		if((a==2|a==c)&!(c>d)&(1==b^c!=d))
		//a==2:3==2 false, 3==3 true -> false or true -> true
		//c>d: 3>5 -> false
	     {
			System.out.println((a==2|a==c));//true
			System.out.println(c>d);//!false->true
			System.out.println((1==b)^(c!=d));//false ^ true => true
			//true & true & true -> true
			System.out.println("맞습니다");
	     }
		else
			System.out.println("아닌데요");
	}

}
