package ch02;

public class ArrayExamle1 {
	public static void main(String[] args) {
		int arr[];//int타입의 배열 선언
		arr=new int[10];//int타입의 값이 들어가는 방을 10개만듬
		arr[0] =10;
		arr[1] =20;
		arr[2] = arr[0] + arr[1];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
	}
}











