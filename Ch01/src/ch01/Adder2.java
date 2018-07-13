package ch01;
//컴퓨터에 명령을 내리는 문장 - 명령문;
public class Adder2 {
	public static void main(String[] args) {
		int total=0;//명령문
		int cnt=1;//명령문
		for(;cnt<=100;) { //1개의 명령문 - for()반복문
			total = total+cnt;//명령문
			cnt++;//1개의 명령문
		}
		System.out.println("총합은:"+total);//명령문
	}
}