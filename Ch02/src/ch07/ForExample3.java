package ch07;

public class ForExample3 {
	public static void main(String[] args) {
		//초기값으로 배열 생성 및 초기화
		int arr[] = {10,20,30,40,50};//길이가 5인 int타입 배열생성
		//배열의 출력을 위해 for문사용
		for(int i=0;i<arr.length;i++) {
			 System.out.println(arr[i]);
		}
		System.out.println("완료");
	}
}
