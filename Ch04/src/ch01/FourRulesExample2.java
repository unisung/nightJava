package ch01;

public class FourRulesExample2 {
	public static void main(String[] args) {
		//byte타입 변수 선언 int타입 리터럴 대입
		byte a=2;//2는 int타입 리터럴
		byte b=3;//3은 int타입 리터럴
		byte sum;
		
		//대입연산자(=)를 기준으로 왼쪽은 byte타입, 오른쪽은 int타입
		sum=(byte)(a+b);//변수a는 int타입 변환,b도 int타입 변환 후 +연산에 참가 
		        //int 와 int의 연산결과는 int
		System.out.println(sum);
		

	}

}
