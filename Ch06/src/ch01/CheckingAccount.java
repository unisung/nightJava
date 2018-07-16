package ch01;
/**
 * 클래스의 상속 = 자식클래스 extends 부모 클래스
 *           :부모클래스가 가진 필드와 메소드를 가짐.
 * */
public class CheckingAccount extends Account {
	//필드 추가	
	String cardNo;
	//기본 생성자(=default생성자,매개변수 없는 생성자)
	CheckingAccount(){
		super();
	}
	//생성자
	public CheckingAccount(String accountNo, String ownerName, 
			int balance, String cardNo) {
		/*this.accountNo=accountNo;
		this.ownerName=ownerName;
		this.balance=balance;*/
		//부모생성자를 호출하는 메소드super();
		//항상 첫줄에 기술.
		super(accountNo, ownerName,balance);
		this.cardNo=cardNo;
	}
	
	//메소드 추가
		int pay(String cardNo, int amount) throws Exception {
			if(!cardNo.equals(this.cardNo)||(balance<amount)) {
				throw new Exception("지불이 불가능합니다.");
			}
			return withdraw(amount);
		}



	
}
