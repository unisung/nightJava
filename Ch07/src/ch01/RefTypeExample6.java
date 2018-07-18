package ch01;
/**
 * 
 * 상속받은 자식클래스를 생성하여 부모타입참조변수에 대입하면(promotion)
 * 자식클래스에서 추가한 필드와 메소드를 사용불가,
 * 다시 자식클래스 타입으로 변환(casting)하면 
 * 자식클래스애서 추가한 필드와 메소드를 사용가능.
 * */
public class RefTypeExample6 {
	public static void main(String[] args) {
	  Account obj;//promotion
	  obj = new CheckingAccount("111-22-333333", "홍길동", 1000000, "4444-5555-6666-7777");
	  CheckingAccount acc = (CheckingAccount)obj;//casting
	  try {
		  
		  /* int amount = obj.pay("4444-5555-6666-7777",48000);*/
		    int amount = acc.pay("4444-5555-6666-7777",48000);
		   System.out.println("인출액:"+amount);
		   /*System.out.println("카드번호:"+obj.cardNo);*/
		   System.out.println("카드번호:"+acc.cardNo);
		  
	  }catch(Exception e) {
		  System.out.println(e.getMessage());
	  }
	}

}
