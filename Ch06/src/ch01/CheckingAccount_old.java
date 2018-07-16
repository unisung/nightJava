package ch01;
/**
 * Account예금 객체는 계좌번호,소유자,잔액을 가지는 객체-속성(필드)
 * 예금기능,인출기능을 가짐-기능(메소드)
 * - 객체는 속성과 기능을 가짐.
 * */
//자바에서 클래스는 객체를 만들기 위한 틀
public class CheckingAccount_old {
    //속성
	public String accountNo;//계좌번호
	public String ownerName;//소유자
	public long balance;//잔액
	public String cardNo;//직불카드 번호
	public long point;
	
	//예금한다 - 기능
	public void deposit(long amount){
		balance=balance+amount;
	}
	//인출한다 - 기능
	public int withdraw(int amount) throws Exception{
		if(balance - amount < 0)
			throw new Exception("잔액이 부족합니다");
		balance = balance - amount;
		return amount;
	}
	//
	int pay(String cardNo, int amount) throws Exception {
		if(!cardNo.equals(this.cardNo)||(balance <amount))
			throw new Exception("지불이 불가합니다.");
		return withdraw(amount);//같은 클래스내의 다른 클래스 호출
		
	}
	
	public void addPoint(long amount) {
		this.point += amount*0.05;
	}
}
