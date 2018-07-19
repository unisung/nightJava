package ch01;

public class MultiThreadExample1 {
	public static void main(String[] args) {
		//자식객체(DigitThread)를 생성하여 부모참조변수에 대입 
		//참조변수의 다형성
		 Thread thread = new DigitThread();
		 //thread의 실행
		 thread.start();
		for(char ch='A';ch<='Z';ch++)
			System.out.println(ch);
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
