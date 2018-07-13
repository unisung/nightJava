package ch04;

public class IfExample3 {
	public static void main(String[] args) {
	   int num1 = 52;//int타입 변수 선언하고 리터럴52를 대입
	   int num2 = 24;//int타입 변수 선언하고 리터럴24를 대입
	   int num3 = 32;//int타입 변수 선언하고 int타입 리털 32를 대입
	   //중첩된 if문인경우 명령문은 가장가까운 if문의 영향을 받음.
	   if(num1>num2) {
		   if(num1>num3) {//
			   System.out.println("num1이 제일큽니다");
		   }  
	   }
	   System.out.println("Done.");
	}

}
