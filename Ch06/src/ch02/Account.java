package ch02;
/**
 * 클래스 앞에 final을 붙이면 상속불가한 클래스
 */
final class Account {
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
