package ch07;

public class ForExample6 {

	public static void main(String[] args) {
		int arr2[] = {1,2,3,4,5,6};
		
		//배열과 동일한타입의 변수 선언
		//선언된 변수는 블럭내에서 사용됨.
		int cnt=1;
		for(int a:arr2) {
			System.out.println(a);
			System.out.println("카운트="+cnt);
			cnt++;
		}
	}
}
