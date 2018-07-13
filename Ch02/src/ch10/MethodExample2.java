package ch10;

public class MethodExample2 {
	//프로그램의 시작은 main()메소드부터시작.
	public static void main(String[] args) {
	 int result;//첫번째 명령문
	 result = add(3,4);//두번째 명령문
	                   //리터럴도 타입을 가짐.
	 //=을 기준을 왼쪽의 result는 int타입
	 System.out.println(result);//세번째 명령문
	}//main()의 끝을 만나면 프로그램 종료.
	
	//메소드-값을 반환하는 메소드의 형태
	//접근지정자 생성위치 리턴타입 메소드명(매개변수){실행블럭   
	//     return 값;
	//    }
    //메소드 생성
	//default - 같은 패키지내에서는 다른 클래스에서 접근가능
	//public - 다른 패키지에서 접근가능
	//private - 같은 패키지내에서도 다른 클래스에 접근불가능
	public static int add(int x,int y){//실행블럭
		int sum;
		sum=x+y;
		return sum;//int타입의 변수의 초기값은 0;
	}
}
