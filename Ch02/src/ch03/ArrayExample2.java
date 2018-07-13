package ch03;

public class ArrayExample2 {
	public static void main(String[] args) {
		//배열선언- table이라는 이름의 int타입 2차원배열 선언
		int table[][];
		table = new int[3][4];
		//길이4인 1차원 배열이 3개 모인배열
		table[0][0]=10;
		table[0][1]=20;
		table[1][1]=30;
		table[2][3]=table[0][0] + table[1][1];
		System.out.println(table[0][0]);
		System.out.println(table[1][1]);
		System.out.println(table[2][3]);
		
		//2차원배열의 배열명.length값은 배열의 행(row)의수가 됩니다.
		for(int i=0;i<table.length;i++) {
			for(int j=0;j<table[i].length;j++) {//반복문 시작
				System.out.print("("+i+","+j+")="+table[i][j]+"  ");//i행의 j열의값 출력
			}//반복문 끝.
			System.out.println();//문장을 출력하고 밑으로 한줄 내려가라는 명령문;
		}
		
		
		
	}

}
