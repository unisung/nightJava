package ch01;

public class GoodsStock2 {
   //속성(필드)
	String goodsCode;
	int stockNum;
   //생성자는 클래스명과 같다.
   //매개변수 2개짜리 생성자
	//생성된 객체의 초기값을 처리함.
	GoodsStock2(String code, int num){
		goodsCode = code;
		stockNum=num;
	}
	//default생성자(기본생성자)=매개변수 없는 생성자
	GoodsStock2(){}
   //기능(메소드)
	void addStock(int amount) {
		stockNum +=amount;
	}
	int subtrackStock(int amount) {
		if(stockNum<amount)
			return 0;
		stockNum -=amount;
		return amount;
	}
}
