package ch04;

public class Accumulator {
	//필드
  int total=0;
  static int grandTotal=0;
  //메소드
  void accumulate(int amount) {
	  total +=amount;//total=total+amount;
	  grandTotal+=amount;
  }
  //static메소드에는 인스턴스변수는 올수없다.
  //static은 로드되어있지만
  //객체(instance)는 static보다 늦게 만들어지기때문.
  public static int getGrandTotal() {
	//total=10;
	return grandTotal;
}
}
