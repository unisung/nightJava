package ch03;

public class ArrayExample4 {
	public static void main(String[] args) {
	 //2차원 배열선언
		int table[][]=new int[3][4];
		table[0][0] =1;
		table[0][1] =2;
		table[0][2] =3;
		table[0][3] =4;
		
		table[1][0] =5;
		table[1][1] =6;
		table[1][2] =7;
		table[1][3] =8;
		
		table[2][0] =9;
		table[2][1] =10;
		table[2][2] =11;
		table[2][3] =12;
		
		//출력
		for(int i=0;i<table.length;i++) {
			for(int j=0;j<table[i].length;j++) {
				System.out.print("("+i+","+j+")="+table[i][j]+"\t");
			}
			System.out.println();
		}
		
		//초기값을 알고있을때 초기값으로 2차원 배열 생성하는 방법
		 int table2[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		 //2차원배열의 행의수확인
		  System.out.println("행의 수:"+table2.length);
		  
		 //2차워배열의 각행의 칼럼수(배열의 길이)확인
		  for(int i=0;i<table2.length;i++) {
			  System.out.println(i+"행의 배열의 길이:"+table2[i].length);
		  }
		  //2차원 배열의 각행의 index요소들의 값을 출력
		  for(int i=0;i<table2.length;i++) {
			  for(int j=0;j<table2[i].length;j++) {
				  System.out.print("("+i+","+j+")="+table2[i][j]+"\t\t");
			  }
			  System.out.println();
		  }
	}
}





