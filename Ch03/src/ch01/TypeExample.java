package ch01;

public class TypeExample {
	public static void main(String[] args) {
		//double타입 변수 선언 double타입 리터럴 대입
		double smallest1 = 4.9e-324;//4.9*10^-324
		double smallest2 = -4.9e-324;//-4.9^-324
		double result1,result2;
		
		 result1 = smallest1/2.0;//가장 미세한 +값을 2로 나누는 식
		 result2 = smallest2/2.0;//가장 미세한 -값을 2로 나누는 식
		 
		 System.out.println("result1="+result1);
		 System.out.println("result2="+result2);

	}

}
