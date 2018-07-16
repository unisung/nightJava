package ch04;
/**
 *  abstract가 붙은 클래스는 바로 instance화가 될수 없음.
 *  - 상속으로 자식클래스를 만들어 사용가능.
 * */
public class AccountMainExample1 {
	public static void main(String[] args) {
		//Account account = new Account();
		//Account account2 = new Account("111-55-3333","홍길동",10000);
		ChildAccount accountChild
		  = new ChildAccount();
		
		ChildAccount accountChild2
		  = new ChildAccount("111-55-3333","홍길동",10000L);
		
		//무명클래스를 생성하여 대입하는 방법-anonymous
		Account account3 = new Account() {};//일종의상속처리
		

	}

}
