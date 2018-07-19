package ch04;

public class MathExample1 {

	public static void main(String[] args) {
		//random()메소드의 범위
		//      0 <= 범위 < 1
		//      0*10 <= 범위*10 < 1*10
		//      0+1 <= 범위 < 10 +1
		//       1  <= 범위 < 11
		System.out.println(Math.random());
		//1~10까지의 난수 발생
		System.out.println((int)(Math.random()*10)+1);
		//20~29까지의 난수 발생
		System.out.println((int)(Math.random()*10)+20);
		

	}

}
