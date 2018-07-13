package ch08;

public class BreakExample4 {
	public static void main(String[] args) {
	outLoop://라벨 선언
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("("+i+","+j+")"+"\t");
				if(i==1 & j==3)
					break outLoop;//안쪽 반복문에서 바깥쪽반복문까지
				                  //벗어나려면 break뒤에 라벨문을 같이 붙여줌.
			}//안쪽 블럭 끝.
			System.out.println();
		}//바깥쪽 블럭 끝.
	}
}
