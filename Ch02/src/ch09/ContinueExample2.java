package ch09;

public class ContinueExample2 {
	public static void main(String[] args) {
		int cnt=0;
		while(cnt<10) {//1<10,2<10,3<10,4<10,5<10,5<10,5<10,5<10
			if(cnt==5)//1!=5,2!=5,3!=5,4!=5,5==5,5==5,5==5,5==5
				continue;//5일때 아래 명령문을 실행하지않음
			System.out.println(cnt);//1,2,3,4
			cnt++;//1,2,3,4,5
		}//반복문 끝,
		System.out.println("끝.");
		
		cnt=0;
		while(cnt<10) {
			System.out.println(cnt);
			cnt++;
			if(cnt==5) continue;//continue문을 만나면 
			                    //continue아래의 명령문은 실행이 되지않음
			                    //continue문을 되도록 제일 아래에 사용.
		}
		
	}
}
