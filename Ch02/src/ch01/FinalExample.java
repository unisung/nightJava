package ch01;

public class FinalExample {
	public static void main(String[] args) {
	//상수 final 을 붙여서 만듦
	 final double pi=3.14;//최초에 한번 값이 대입됨.
	 double radius = 2.0, circum;
	 circum = 2*pi*radius;// 별표(*)연산자 곱하기(*); →
	 System.out.println(circum);
	 radius =3.0;//변수의 값을 변경하는 명령문
	 //pi=3.1415;//두번은 안바뀜.

	}

}
