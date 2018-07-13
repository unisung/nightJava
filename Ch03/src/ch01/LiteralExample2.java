package ch01;

public class LiteralExample2 {
	public static void main(String[] args) {
		System.out.println(120);//정수120출력(10진수)
		System.out.println(024);//20출력(8진수) 2*8^1+4*8^0=2*8+4*1=16+4=20
		System.out.println(0x30A1);//12449:3*16^3+0*16^2+A*16^1+1*16^0
		                           //4096*3 + 0 + 160 + 1=12288+161 
		System.out.println(0x0030a1);
	}
}
