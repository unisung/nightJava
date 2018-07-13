package ch06;

public class WhileExample1 {
	public static void main(String[] args) {
		//int타입 변수 선언후 int리터럴0을 대입
		int cnt=0;
	  //① cnt가 10보다 작은지 확인
	  //② cnt가 10보다 작은지 확인이됬으면(true)
	  //③ 블럭내의 명령문 실행함.
	  //④ 명령문 실행후 블럭의 마지막부분(})을 만나면
	  //⑤ 다시 ①번으로 가서 반복함.
	  //조건이 끝까지 true인 경우 무한 반복 (=무한루프)
	  while (cnt<10) {
		 System.out.println(cnt);
		 cnt=cnt+1;
	  }
		
	}

}
