package ch01;

public class LiteralExample {
	public static void main(String[] args) {
		//escape sequence를 사용한 문자출력
		char arr[]= {'뇌','를','\uC790','\uADF9',
				     '하','는','\n','J','a','\166','\141','\\'};
		//향상된 for문
		for (char c : arr) {
			System.out.print(c);
		}
	}

}
