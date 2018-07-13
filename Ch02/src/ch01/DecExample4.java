package ch01;

public class DecExample4 {
	public static void main(String[] args) {
		//초기화 블럭
		{
			int num=10;//블럭내에서 선언된 변수는 블럭을 벗어나면 사라짐
			System.out.println(num);
		}
		System.out.println(num);
	}

}
