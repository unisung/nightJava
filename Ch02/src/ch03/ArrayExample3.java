package ch03;

public class ArrayExample3 {
	public static void main(String[] args) {
		//arr이라는 이름의 int타입의 배열을 선언하고 길이가10인 배열의 번지를 대입
		int arr[]=new int[10];
		//arr이라는 정수타입의 배열에 각 인덱스에 해당하는 방에 값(정수 리터럴)을 대입.
		arr[0] =10;
		arr[1] =20;
		arr[2] =30;
		arr[3] =40;
		arr[4] =50;
		arr[5] =60;
		arr[6] =70;
		arr[7] =80;
		arr[8] =90;
		arr[9] =100;
		//arr배열의 각 index에 해당하는 방의 값을 출력하는 문장
	for(int i=0;i<arr.length;i++) {
		 System.out.print(arr[i]+" ");
	}
	System.out.println();
      
	//arr2배열에 입력되는 초기값을 알고 있을때 
	//초기값으로 배열을 생성하여 대입가능
	  int arr2[] = {10,20,30,40,50,60,70,80,90,100};
	 //배열의 길이확인
	  System.out.println("생성된 배열의 길이:"+arr2.length);
	 //배열의 각 index에 해당하는 방의 값출력
	  for(int i=0;i<arr2.length;i++) {
		  System.out.print(arr2[i]+" ");
	  }   
	}//main()메소드 끝.

}
