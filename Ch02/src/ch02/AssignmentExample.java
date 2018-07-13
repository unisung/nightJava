package ch02;
/*
 * 복합 대입 연산자: 대입연산자와 사칙연산자가 결합된 형태
 * */
public class AssignmentExample {
	public static void main(String[] args) {
	  int num=17;//로컬변수 num을 선언하고 초기값으로 17을 대입하는 명령문
	  num+=1;//num=17+1;
	  System.out.println(num);
	  num-=2;//num=18-2;
	  System.out.println(num);
	  num*=3;//num=16*3;
	  System.out.println(num);
	  num/=4;//num=48/4;
	  System.out.println(num);
	  num%=5;//num=12%5;--몫2, 나머지 2
	  System.out.println(num);
	  
	}

}
