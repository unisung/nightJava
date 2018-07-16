package ch05;

public class InheritExample1 {
	public static void main(String[] args) {
		ExmailSender obj1 
		 = new ExmailSender("생일을 축하합니다.", 
		              "고객센터","admin@likeshop.com","10%할인쿠폰이발행되었습니다.");
		SMSSender obj2 = new SMSSender("생일을 축하합니다", "고객센터",
				      "02-000-0000","10%할인쿠폰이 발행되었습니다.");
		//메소드의 다형성
		//메소드의 이름은 같지만
		//실행되는 결과가 다른것 - 다형성
		obj1.sendMessage("hong@daum.net");
		obj1.sendMessage("kim@naver.com");
		obj2.sendMessage("00-000-0000");

	}

}
