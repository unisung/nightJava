/* 범위 주석 - 주석은 프로그램과 무관하게 정보를 기록하는 기능  
 * 주석은 컴파일하면 class에 포함되지는 않습니다.
 프로그램 이름: HelloJava11
 프로그램 설명: Hello, Java를 10번 출력하는 프로그램
 작성일:2018/7/3
 작성자:홍길동
*/
public class HelloJava11 {
	public static void main(String[] args) {
		int num=0; //변수 선언과 동시에 초기화를 하는 명령문;
		           //int num;  num=0; 두개의 명령문이 하나로 합쳐짐
		while(num>0) {
			System.out.println("Hello,Java");
			 num=num+1;
		}

	}

}
