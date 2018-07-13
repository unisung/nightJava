package ch01;

public class PrimitiveRangeExample {
	public static void main(String[] args) {
	//기본데이타입:        byte,short,int,    long <=변수의 타입한정 기능만 있음. 
	//래퍼(wrapper)클래스:Byte,Short,Integer, Long <=변수의 범위,타입변환등 클래스로서의 기능.
	//클래스는 필드(속성)와 메소드(기능)을 가짐.	
	System.out.println(Byte.MIN_VALUE+"<=byte의 범위<="+Byte.MAX_VALUE);
	System.out.println(Short.MIN_VALUE+"<=short의 범위<="+Short.MAX_VALUE);
	System.out.println(Integer.MIN_VALUE+"<=int의 범위<="+Integer.MAX_VALUE);
	System.out.println(Long.MIN_VALUE+"<=long의 범위<="+Long.MAX_VALUE);
		
		
	}

}
