package ch01;

public class GoodsStockMain {
	public static void main(String[] args) {
		//참조변수 선언
		GoodsStock gs;
		//객체 생성 new 생성자();
		gs = new GoodsStock();
		
		//객체의 속성과 기능의 접근은 dot(.)으로 함.
		gs.goodsCode="1001";
		gs.stockNum=100;
		System.out.println("gs의상품코드:"+gs.goodsCode);
		System.out.println("gs의 재고수량:"+gs.stockNum);
		//메소드 호출 참조변수.메소드명
		gs.addStock(50);
		System.out.println("gs의 현재고수량:"+gs.stockNum);
		gs.subStrackStock(70);
	    System.out.println("gs의 현재고수량:"+gs.stockNum);	
	    gs.subStrackStock(90);//실행은 됬지만 로직에 의해 출고안됨.
	    System.out.println("gs의 현재고수량:"+gs.stockNum);
	    
		
	}

}
