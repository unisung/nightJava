package ch09;

/**
 * continue 라벨;바깥쪽 회차를 스킵
 * */
public class ContinueExample3 {
	public static void main(String[] args) {
		outerLoop:
			for(int row=0;row<3;row++) {
				for(int col=0;col<5;col++) {
					if(row==1 && col==3)
						continue outerLoop;//바깥쪽 반복문의 해당회차를 skip
					System.out.print("("+row+","+col+")"+"\t");
					
				}
				System.out.println();
			}
	}
}
