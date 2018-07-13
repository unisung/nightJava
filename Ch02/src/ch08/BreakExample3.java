package ch08;

public class BreakExample3 {
	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			for (int j=0; j < 5; j++) {
				System.out.print("("+i+","+j+")"+"\t");
			}
			System.out.println();
			if(i==1) break;
		}
	}
}
