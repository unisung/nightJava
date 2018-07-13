package ch04;

public class LimitedValue {
	//final static -상수 는 최초 1회는 초기화됨.
	//한번 초기화 된후는 더이상 변경이 안됨.
  final static int UPPER_LIMIT = 100000;
  int value;
  
  void setValue(int value) {
	  if(value<UPPER_LIMIT)
		  this.value=value;
	  else
		  this.value=UPPER_LIMIT;
	  
	  //UPPER_LIMIT=200000;<-불가
  }
}
