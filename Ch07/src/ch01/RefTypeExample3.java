package ch01;

public class RefTypeExample3 {
	public static void main(String[] args) {
		//객체 참조변수가 instance를 참조하지 못한 상태
		//NullPointException상태
		Point obj=null;
		//조건문으로 예외발생을 미리 방지
		/*if(obj==null) {
			System.out.println("obj변수가 가리키는 객체가 없습니다");
			return;//종료
		}*/
		try {
		System.out.println(obj.x);
		System.out.println(obj.y);
		}catch(java.lang.NullPointerException e) {
			System.out.println("예외가 발생하였씁니다");
		}
	}
}
