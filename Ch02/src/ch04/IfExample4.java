package ch04;

public class IfExample4 {
	public static void main(String[] args) {
		int num1 =152;
		int num2 =173;
		if(num1>num2){//결과값이 false
			if(num1>100)
				System.out.println("num1="+num1);
		}else{//num1<100인 경우
		     if(num2>100)
			 	System.out.println("num2="+num2);
		}
	    //제일 바깥쪽 if의 범위
		   System.out.println("Done.");
	}

}
