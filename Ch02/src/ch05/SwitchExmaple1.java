package ch05;

public class SwitchExmaple1 {
	public static void main(String[] args) {
		int num=2;
		
		//switch문은 미리 경우의 수에 맞게 이동할 case를 만들어 놓음.
		switch (num) {
		case 1:System.out.println("GoodMorning,Java");
			break;//switch문 블럭을 벗어나는 역활
		case 2:System.out.println("GoodAfternoon,Java");
			break;
		case 3:System.out.println("GoodEvening,Java");
			break;
		default: System.out.println("Hello,Java");
			break;
		}
		System.out.println("Done.");
	}

}
