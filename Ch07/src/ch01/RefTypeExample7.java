package ch01;

public class RefTypeExample7 {
	public static void main(String[] args) {
		Account obj1 = new Account("111-22-333333", "홍길동", 100000);
		// 참조변수 instanceof 객체 <= 참조변수가 해당 객체타입으로 변환가능한지 여부확인
		// 연산자 instanceof 
		if(obj1 instanceof CheckingAccount)
			System.out.println("변환가능");
		else
			System.out.println("변환불가");
		
		CheckingAccount obj2 = (CheckingAccount)obj1;//절대 불가
		
		try {
			
			int amount = obj2.pay("5555-6666-7777-8888", 47000);
			System.out.println("인출액:"+amount);
			System.out.println("카드번호:"+obj2.cardNo);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
