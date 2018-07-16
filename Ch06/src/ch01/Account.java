package ch01;
/**
 * Account예금 객체는 계좌번호,소유자,잔액을 가지는 객체-속성(필드)
 * 예금기능,인출기능을 가짐-기능(메소드)
 * - 객체는 속성과 기능을 가짐.
 * */
//자바에서 클래스는 객체를 만들기 위한 틀
public class Account {
    //속성
	public  String accountNo;//계좌번호
	public  String ownerName;//소유자
	public  long balance;//잔액
	public long point;
	//기본생성자가 없으면 컴파일시 기본생성자를 삽입
	 public Account() {}
	//기본생성자가 아닌 매개변수 있는 생성자를 추가하면
	//자바는 기본생성자를 만들지 않음.
	public Account(String accountNo, String ownerName, long balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	//예금한다 - 기능
	public void deposit(long amount){
		balance+=amount;
	}
	//인출한다 - 기능
	public int withdraw(long amount) throws Exception{
		if(balance - amount < 0)
			throw new Exception("잔액이 부족합니다");
		balance = balance - amount;
		return (int)amount;
	}
	
	public void addPoint(long amount) {
		this.point += amount*0.05;
	}
}
