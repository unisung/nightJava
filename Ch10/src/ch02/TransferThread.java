package ch02;

class TransferThread extends Thread {
    SharedArea sharedArea;
    TransferThread(SharedArea area) {   // 생성자
        sharedArea = area;
    }
    public void run() {
       for (int cnt = 0; cnt < 12; cnt ++) {
    	   synchronized (sharedArea) {
            sharedArea.account1.withdraw(1000000);
            System.out.print("이몽룡 계좌: 100만원 인출,");
            sharedArea.account2.deposit(1000000);
            System.out.println("성춘향 계좌: 100만원 입금");
    	   }
        }
    }
}