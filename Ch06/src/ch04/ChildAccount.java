package ch04;

public class ChildAccount extends Account{
	//기본생성자가 없기 때문에 컴파일시 추가
	ChildAccount(){super();}

	public ChildAccount(String accountNo, String ownerName, long balance) {
		super(accountNo, ownerName, balance);
	}
	
	

}
