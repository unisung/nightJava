package ch01;

public class InheritanceExample2 {
	public static void main(String[] args) {
	  CreditLineAccount obj 
	  = new CreditLineAccount("000-11-1111", "임꺽정",10000,20000000);
	  try {
		   int amount = obj.withdraw(50000);
		   System.out.println("인출액:"+amount);
		   System.out.println("잔액:"+obj.balance);
		   System.out.println("마이너스 한도:"+obj.creditLine);
	  }catch(Exception e) {
		  
	  }
	}

}
