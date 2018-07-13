package ch04;

public class StaticExample1 {
	public static void main(String[] args) {
		//클래스로부터 객체(instance)생성시
		//static키워드가 붙은 필드는 static영역으로 빠져나감
		//새로운 객체가 생성되면 static키워드가 붙은 필드는 다시
		//생성하지않고, 공유해서 사용함.(프로그램 종료시까지)
		Accumulator obj1 = new Accumulator();
		Accumulator obj2 = new Accumulator();
		
		obj1.accumulate(10);
		obj2.accumulate(20);
		
		System.out.println("obj1.total="+obj1.total);
		System.out.println("obj1.grandTotal="+obj1.grandTotal);
		System.out.println("obj2.total="+obj2.total);
		System.out.println("obj2.grandTotal="+obj2.grandTotal);
		
		//클래스명.필드명(static필드는 클래스에 속한 필드)
		System.out.println("총계:"+Accumulator.grandTotal);

	}

}
