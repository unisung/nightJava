package ch11;

public class SmartExample {
	public static void main(String[] args) {
		int a=3,b=0;
		int result;
		//로직을 처리할 실행문은 try블럭내에서 기술
		try{
			result=a/b;
			System.out.println(result);
		}catch(Exception e) {// Exception타입의 변수 e선언
			System.out.println("잘못된 연산입니다.");
		}//finally블럭은 프로그램의 예외 발생과 무관하게
		 //프로그램 종료시 반시 처리해야하는 문장을 기술.
		 //해당프로그램은 반드시 수행 후 종료가 됨.
		finally {
			System.out.println("Done");
		}
	}
}
