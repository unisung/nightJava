package ch01;

public class DecExample5 {
	public static void main(String[] args) {
		int num=10;//블럭밖에서 선언 및 초기화 후 
		{
			num=30;//블럭내에서 값을 30으로 바꾼경우
		}
		System.out.println(num);//출력값은 30으로 바뀜
	}
}
