package ch02;

public class MethodExample3 {
	public static void main(String[] args) {
	  int[] arr=new int[0];//길이가 0인 배열
	  Numbers obj = new Numbers(arr);
	  //예상하지못하게 발생한 예외를
	  //처리하는 구문
	  //try{처리해야할 문장;}catch(Exception e){예외처리문;}문
	  try {
		  int average = obj.getAvg();
		  System.out.println("평균="+average);
	  }catch(Exception e){
		  //System.out.println(e.getMessage());
		  System.out.println("0으로 나눌수 없습니다.");
	  }
	}

}
