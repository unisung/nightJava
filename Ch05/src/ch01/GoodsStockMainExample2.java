package ch01;

public class GoodsStockMainExample2 {
	public static void main(String[] args) {
		GoodsStock2 obj;//참조변수 선언
		//객체의 생성은
		//new 연산에 의해서 생성자를 호출하면됨.
		obj = new GoodsStock2("5112", 200);
		System.out.println("상품코드:"+obj.goodsCode);
		System.out.println("재고수량:"+obj.stockNum);
		
		GoodsStock2 obj2;
		//기본생성자(매개변수 없는 생성자)호출
		//GoodsStock2에 있어야 오류가 안남.
		//자바소스코드에 생성자가 하나도 없으면
		//기본생성자(매개변수 없는 생성자)를 
		//컴파일시 만들어 주지만
		//생성자가 하나라도 있으면(기본생성자외의 다른 생성자도 포함)
		//컴파일시 기본생성자를 만들지 않음.
		obj2 = new GoodsStock2();
		
		//클래스에 기본생성자가
		//없으면 컴파일실 자바머신이 
		//클래스에 기본생성자를 넣어줌
		GoodsStock goods = new GoodsStock();

	}

}
