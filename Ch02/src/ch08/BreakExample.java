package ch08;

public class BreakExample {
	public static void main(String[] args) {
		//break문은 반복문을 빠져나가는 명령문
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if(i==5) 
				break;//블럭을 빠져나가는 명령문
		}
		System.out.println("완료");
	}
}
