package ch02;

public class OldExample {
	public static void main(String[] args) {
		ClothingInfo obj = 
new ClothingInfo("32919","반팔티셔츠","면100%",ClothingInfo.SUMMER);
		System.out.println("상품코드:"+obj.code);
		System.out.println("상품명:"+obj.name);
		System.out.println("소재:"+obj.material);
		System.out.println("계절구분:"+obj.season);
		
		ClothingInfo obj2 = 
				new ClothingInfo("32919","반팔티셔츠","면100%",Season.SUMMER);
						System.out.println("상품코드:"+obj.code);
						System.out.println("상품명:"+obj.name);
						System.out.println("소재:"+obj.material);
						System.out.println("계절구분:"+obj.season);


	}

}
