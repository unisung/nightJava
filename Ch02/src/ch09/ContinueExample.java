package ch09;

/**
 * continue문은 해당회차를 건너뛰는 명령문
 * */
public class ContinueExample {
	public static void main(String[] args) {
		for(int cnt=0;cnt<10;cnt++) {
			if(cnt==5) 
				continue;
			System.out.println(cnt);
		}
		System.out.println("완료");
	}
}
