package ch01;

public class CreditLineAccount extends Account {
	int creditLine;
	
	public CreditLineAccount(String accountNo,String ownerName, 
			           int balance, int creditLine){
		super(accountNo,ownerName,balance);
		this.creditLine=creditLine;
	}
	//메소드 오버라이딩(overriding)
	@Override
	public int withdraw(long amount) throws Exception {
		if((balance + creditLine) < amount)
			throw new Exception("인출이 불가능합니다.");
		balance -=amount;
		return (int)amount;
	}
	//추가된메소드 - 메소드 오버로딩
	public int withdraw(int amount) throws Exception {
		if((balance + creditLine) < amount)
			throw new Exception("인출이 불가능합니다.");
		balance -=amount;
		return amount;
	}
	

}