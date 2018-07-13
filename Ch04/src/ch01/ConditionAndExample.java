package ch01;

public class ConditionAndExample {
	public static void main(String[] args) {
	  int num1=1, num2=1;
	  if(--num1 > 0 && --num2>0 )//왼쪽이 false면 오른쪽 연산을 하지않음
		  System.out.println("num1이 0보다크고, num2도 0보다 큽니다");
	    System.out.println("num1="+num1);
	    System.out.println("num2="+num2);
	    
	    num1=1;num2=1;
	    if(--num1 > 0 & --num2>0 )//왼쪽이 false라도 오른쪽 연산을 함.
			  System.out.println("num1이 0보다크고, num2도 0보다 큽니다");
		    System.out.println("num1="+num1);
		    System.out.println("num2="+num2);  
	
	  
	}

}
