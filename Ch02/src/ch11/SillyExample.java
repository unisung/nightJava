package ch11;

public class SillyExample {
	public static void main(String[] args) {
		//int타입 변수 선언 후 int리터럴 대입
		int a=3, b=0;//첫번째 명령문
		int result;//두번째 명령문
		//예외(오류) 방지
		if(b==0) {
			b=1;
		}
		result = a/b;//세번째 명령문
		System.out.println(result);//네번째 명령문
		System.out.println("Done.");//다섯번째 명령문
	}//종료지점

}
