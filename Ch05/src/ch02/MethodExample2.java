package ch02;

public class MethodExample2 {
	public static void main(String[] args) {
		//길이가 10인 배열 생성
		int[] arr={10,20,30,40,50,60,70,80,90,100};
		
		Numbers obj = new Numbers(arr);
		
		int total = obj.getTotal();
		
		System.out.println("합계="+total);
		System.out.println("평균="+obj.getAvg());
	}

}
