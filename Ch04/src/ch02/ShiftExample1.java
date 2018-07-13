package ch02;

public class ShiftExample1 {
	public static void main(String[] args) {
		int num=0xFF00FF01;
		int result1 = num << 3;//11111000000001111111100000001000    <<3
		int result2 = num >> 3;//11111111111000000001111111100000
		int result3 = num >>>3;//00011111111000000001111111100000
	    System.out.printf("%08x %n", result1);
	    System.out.printf("%08x %n", result2);
	    System.out.printf("%08x %n", result3);
	}
}
