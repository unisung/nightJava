package ch01;
//Thread클래스 상속받아서 Thread객체를 만듬
//실행할 명령문은 run()메소드 내에 기술
public class DigitThread extends Thread{
	
	public void run() {
	 for(int cnt= 0 ; cnt<1000;cnt++)
		 System.out.println(cnt);
	 try {
		   Thread.sleep(1000);
	 }catch(Exception e) {
		 System.out.println(e.getMessage());
	 }
	}

	
}
