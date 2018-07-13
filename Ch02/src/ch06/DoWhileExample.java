package ch06;

public class DoWhileExample {
	public static void main(String[] args) {
		//int타입 변수 선언 및 리터럴0대입
		int cnt=0;
		//① 명령문 실행
		//② 블럭의 마지막(})을 마나면
		//③ cnt<10보다 작은 지 확인
		//④-1. 결과가 true이면 다시 ①부터 반복
		//④-2. 결과가 false이면 반복문을 벗어남.
		// * do~while문은 조건이 참이든 거짓이든 최초 1회는 무조건 실행됨.
		do {
			System.out.println(cnt);
			cnt++;
		} while (cnt<10);

	}

}
