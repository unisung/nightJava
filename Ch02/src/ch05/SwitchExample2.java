package ch05;

public class SwitchExample2 {
	public static void main(String[] args) {
		//char타입 변수 선언 char타입 리러털 'p'를 대입
	  char ch='A';
	  switch (ch) {
	case 'A':
	case 'a':
		 System.out.println("사과");
		break;
	case 'P':
	case 'p':
		System.out.println("배");
		break;
	case 'G':
	case 'g':
		System.out.println("포도");
		break;
	default:
		System.out.println("?");
		break;
	}

	}

}
