package ch08;

public class BreakExample2 {
	public static void main(String[] args) {
	   //이중 반복문
	  for (int i = 0; i < 3; i++) {//바깥for문 블럭시작
		 for (int j = 0; j < 5; j++) {//안쪽for문 블럭시작
			    System.out.print("("+i+","+j+")"+"\t");
			    if(i==1 && j==3)
			    	break; //안쪽 반복 블럭을 벗어남
			}//안쪽 for문 블럭 끝.
		 System.out.println();
	   }//바깥for문 끝.
	  System.out.println("완료");
	}

}
