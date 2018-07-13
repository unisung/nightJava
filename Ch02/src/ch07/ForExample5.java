package ch07;

/**
 * 향상된 for문(타입 변수:배열객체){실행문}
 * 실행문 내에서는 선언한 변수가 사용됨.
 * */
public class ForExample5 {
	public static void main(String[] args) {
		//초기값으로 int타입의 1차원 배열 생성
		int arr[] = {10,20,30,40,50};
		//배열출력
	    //인덱스 번호가 0부터 arr.length길이 만큼 반복처리
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		//선언한 i가 배열 arr의 처음부터 마지막까지 반복처리
		for(int i:arr) {//블럭내에서는 선어한변수(i)를 사용.
			System.out.println(i);
		}
		

	}

}
