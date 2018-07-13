package ch02;

public class IncDecExample2 {
	public static void main(String[] args) {
		int family=5;
		int customer=5;
		System.out.println(family++);//출력값:5,6
		System.out.println((++family + ++customer));//7,7 6,6
	}
}
