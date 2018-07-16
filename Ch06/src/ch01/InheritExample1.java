package ch01;

public class InheritExample1 {
	public static void main(String[] args) {
		CheckingAccount obj = new CheckingAccount();
		obj.accountNo="111-22-33333";
		obj.ownerName="홍길동";
		obj.cardNo="5555-6666-7777-8888";
		obj.deposit(100000);
		
		CheckingAccount obj2 
		   = new CheckingAccount("111-22-33335","일지매", 0, "5555-6666-7777-9999");
		obj2.deposit(100000);
		try {
			int paidAmount = obj.pay("5555-6666-7777-8888", 47000);
			System.out.println("지불액:"+paidAmount);
			System.out.println("잔액:"+obj.balance);
			
			paidAmount=obj2.pay("5555-6666-7777-9999", 56000);
			System.out.println("지불액:"+paidAmount);
			System.out.println("잔액:"+obj2.balance);
		}catch(Exception e) {
			String msg = e.getMessage();
			System.out.println(msg);
		}
		
	}

}
