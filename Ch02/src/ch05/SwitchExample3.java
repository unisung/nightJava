package ch05;

public class SwitchExample3 {
	public static void main(String[] args) {
	   //int타입의 변수 time을 선언하고 int타입 리터럴 7을 대입
		 int time=12;
		 
		 switch (time) {
		case 6: 
      			System.out.println("기상합니다.");
		case 7:
			   System.out.println("아침을 먹습니다.");
		case 8:
			   System.out.println("출근을 합니다");
		case 9:
			   System.out.println("회의를 합니다.");
		case 10:
			   System.out.println("외근을 나갑니다");
			   break;
		default:
			   System.out.println("휴식을 합니다.");
			break;
		}
		 

	}

}
