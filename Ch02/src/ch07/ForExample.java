package ch07;

public class ForExample {
	public static void main(String[] args) {
		
		//① int i를 선언 후 리터럴0을 대입
		//② i<10 인지를 확인,결과값이 참이면 
		//③ 블럭내의 명령문을 실행
		//④ 블럭의 마직막부분(})을 만나면
		//⑤ 블럭위로 올라가서 i++를 실행
		//⑥ i<10인지 확인, 결과값이 참이면 명령문실행,
		for (int i = 0; i < 10 ; i++) {
			 System.out.println("i="+i);
		}
		
		System.out.println("Done.");
		
		int j=0;
		for( ; j<10 ; ) {
			System.out.println("j="+j);
			 j++;
		}

	}

}
