package ch07;
//인터페이스
//(추상)메소드로 구성된 객체
public interface Lendable {
  byte STATE_BORROWED =1;//대출중 기본적으로 final static 
  final static byte STATE_NORMAL=0;//대출되지않은 상태
  void checkOut(String borrower,String date);
  void checkIn();
}
