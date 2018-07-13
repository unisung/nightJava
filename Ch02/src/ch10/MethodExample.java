package ch10;

public class MethodExample {
	public static void main(String[] args) {
		//메소드의 호출은
		//메소드명(파라미터값);
		printCharacter('*',30);
		System.out.println("Hello,Java");
		printCharacter('-', 30);
		printCharacter('A',20);

	}//main()메소드 끝.- 프로그램의 종료는 main메소드의 끝을 만나면 종료.
	//메소드 설계도
	//static:메모리의 static영역에 만들어라는 명령
	//void:return문이 없는 메소드를 만들어라
	//printCharacter:메소드명
	//(char ch,int num):매개변수(parameter)를 외부로부터 받는데
	//순선대로char타입의 값을 받고, int타입의 값을 받도록 만들어라
	static void printCharacter(char ch,int num) {
		for(int cnt=0;cnt<num;cnt++)
			System.out.print(ch);
		System.out.println();
	}
	

}
