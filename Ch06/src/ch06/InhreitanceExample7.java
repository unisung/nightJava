package ch06;

import ch01.Account;
import ch01.BonusPointAccount;
import ch01.CheckingAccount;
import ch01.CreditLineAccount;

public class InhreitanceExample7 {
	public static void main(String[] args) {
	Account obj1 = new Account("111-22-33333", "홍길동", 10000);
	CheckingAccount obj2 
	 = new CheckingAccount("444-55-66666", "일지매", 20000, "555-666-777-888");
	 CreditLineAccount obj3
	 = new CreditLineAccount("777-888-99999", "임꺽정", 30000, 20000000);
	 BonusPointAccount obj4
	  = new BonusPointAccount("000-00-00000", "김선달", 0, 0);
	 
	 printAccountInfo(obj1);
	 printAccountInfo(obj2);
	 printAccountInfo(obj3);
	 printAccountInfo(obj4);
	   
	}
  //참조변수의 다형성
	private static void printAccountInfo(Account obj1) {
	 System.out.println("계좌번호:"+obj1.accountNo+"예금주:"+obj1.ownerName+"잔액:"+obj1.balance);
		
	}

}
