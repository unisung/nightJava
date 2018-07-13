package ch02;

public class CastExample1 {
	public static void main(String[] args) {
		short num1 = (short)300;
		byte num2 = (byte)300;//
		System.out.println(Byte.MIN_VALUE+"<=byte의 범위<="+Byte.MAX_VALUE);
		int num3 = (int)12.9;
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);

	}

}
