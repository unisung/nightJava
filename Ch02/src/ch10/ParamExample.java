package ch10;
/**
 * JAVA프로그램의 실행은 main()메소드부터 시작.
 * JVM(자바가상머신)은 프로그램 실행시
 * 제일먼저 해당프로그램의 main()메소드를 찾아서
 * 실행. ->main()메소든 다름 메소드를 실행역할.
 * 프로그램실행시 초기값으로 파라미터를 넘기면
 * main()메소드가 값을 받아서 처리함.
 * String[] args <- 이배열에 값들이 담겨서 넘어옴.
 * 
 * Hello  홍길동   안녕 "방가여 길동씨"
 * args[0]="Hello"
 * args[1]="홍길동"
 * args[2]="안녕"
 * args[3]="방가여 길동씨"
 * */
public class ParamExample {
	public static void main(String[] args) {
	 //반복문. 
	 //String[] args:배열, 길이가 정해져있지않은 배열
     //파라미터를 받는순간 배열의 길이가 정해짐.
	 for(int i=0;i<args.length;i++)
		 System.out.println(args[i]);//배열의 index
	  System.out.println(args.length);
	  
	 //향상된 for문
	  for (String s : args) {
		 System.out.println(s);//반복자(iterator) 사용  
	}
	  
	}

}
