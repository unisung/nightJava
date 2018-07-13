package ch01;

//GoodsStock객체의 설계도 (클래스)
public class GoodsStock {
	//속성
	String goodsCode;//고유속성
	int stockNum;//현재상태 7
	GoodsStock(){}
	//기능
	//메소드의 형태
	//[접근지정자] 리턴타입 메소드명(매개변수){실행부}
	void addStock(int amount){//리턴타입이 없는 메소드(void)
		/*stockNum =stockNum+amount;*/
		stockNum +=amount;
	}
	//int타입의 결과를 반환하는 메소드
	int subStrackStock(int amount){
		/*stockNum = stockNum - amount;*/
		if(stockNum < amount)
			return 0;
		stockNum -=amount;
		return amount;//메소드명 앞에 리턴타입(int)이 있으면 return문을 써줘야함.
	}

}
