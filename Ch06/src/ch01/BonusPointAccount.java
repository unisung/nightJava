package ch01;

public class BonusPointAccount extends Account{
	//추가된 필드
	int bonusPoint;
	
	//생성자
	public BonusPointAccount() {super();}
	public BonusPointAccount(String accountNo, String ownerName,
			                 long balance,int bonusPoint) {
		super(accountNo, ownerName, balance);
		this.bonusPoint=bonusPoint;
	}

	//메소드오버라이딩
	@Override
	public void deposit(long amount) {
		/*balance +=amount;*/
		super.deposit(amount);//부모의메소들 호출super();
		bonusPoint +=(int)(amount*0.001);
	}
	
   

	
	

}
