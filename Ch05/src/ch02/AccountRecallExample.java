package ch02;

import ch01.Account;

public class AccountRecallExample {
	public static void main(String[] args) {
		Account account = new Account();
		account.balance=10000;//잔액 10000원
		try {
		account.withdraw(5000);
		System.out.println("잔액="+account.balance);
		account.withdraw(3000);
		System.out.println("잔액="+account.balance);
		account.withdraw(6000);
		System.out.println("잔액="+account.balance);
		}catch(Exception e) {
			System.out.println(e.getMessage());//"잔액이 부족합니다"
		}

	}

}
