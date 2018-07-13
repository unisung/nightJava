package ch01;

public class IncDecExample2 {
	public static void main(String[] args) {
		int a=2,b=3,result;
		result = ++a + --b * a--;//3+2*3
		System.out.println("a="+a);//++a(2->3),a--(3->2)
		System.out.println("b="+b);//--b(3->2)
		System.out.println("result="+result);
		
		


	}

}
