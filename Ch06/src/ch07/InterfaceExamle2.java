package ch07;
/**
 * 인터페이스 변수의 다형성
 * */
public class InterfaceExamle2 {
	public static void main(String[] args) {
		//Lendable 인터페이스 가 3개 저장가능한 배열
		Lendable arr[] = new Lendable[3];
		//Lendable인터페이스가 최상위 부모객체가 됨
		//SeparateVolue,AppCDInfo가 자식객체
		Lendable obj1 =new SeparateVolume("883", "푸코", "에코");
		arr[0] = obj1;
		Lendable obj2=new SeparateVolume("609.2", "서양미술사", "곰브리치");
		arr[1] = obj2; 
		Lendable obj3 = new AppCDInfo("02-17", "XML을 위한 자바 프로그램");		
		arr[2] = obj3;
		
		checkOutAll(arr,"홍길동","20180717");
	}

	private static void checkOutAll(Lendable[] arr, String borrower, String date) {
		for(int i=0;i<arr.length;i++)
			arr[i].checkOut(borrower, date);
		//arr[i]:i가0일때 arr[0]의 내용 중 .checkout()
	}

}
