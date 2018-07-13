
public class HelloJava10 {

	public static void main(String[] args) {
		int num;//변수 선언문
		num=0;//대입문 - 0을 num이라는 변수에 대입
		while(num<10) {//while(조건) <- 조건이 true일때까지 반복처리 명령문
			System.out.println(num<10);
			System.out.println("Hello,Java");//출력문
			num=num+1;//대이입문
		}
		System.out.println(num<10);

	}

}
