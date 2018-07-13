package ch01;

public class ConstrExample3 {

	public static void main(String[] args) {
		SubscriberInfo obj;
		obj = new SubscriberInfo();
		//객체를 메소드의 매개변수로 넘겨줄수 있음.
		printSubscribeInfo(obj);
		
		obj =
	 new SubscriberInfo("홍길동","hong","1234","010-111-1234","서울시");
		printSubscribeInfo(obj);
	}

	private static void printSubscribeInfo(SubscriberInfo obj) {
	   System.out.println("이름:"+obj.name);
	   System.out.println("아이디:"+obj.id);
	   System.out.println("패스워드:"+obj.password);
	   System.out.println("전화번호:"+obj.phoneNo);
	   System.out.println("주소:"+obj.address);
		
	}
}
