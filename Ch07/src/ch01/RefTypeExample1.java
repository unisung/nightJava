package ch01;

public class RefTypeExample1 {
	public static void main(String[] args) {
	  Point obj1 = new Point(10,20);
	  
	  //obj1의 참조값(객체의 주소번지)를 obj2변수에 대입
	  Point obj2 = obj1;
	  
	  System.out.printf("obj1=(%d,%d) %n", obj1.x, obj1.y);
	  System.out.printf("obj2=(%d,%d) %n", obj2.x, obj2.y);
	  
	  obj2.x=30;
	  
	  System.out.printf("obj1=(%d,%d) %n", obj1.x, obj1.y);
	  System.out.printf("obj2=(%d,%d) %n", obj2.x, obj2.y);

	  rearrange(obj1);
	  
	  System.out.printf("obj1=(%d,%d) %n", obj1.x, obj1.y);
	  System.out.printf("obj2=(%d,%d) %n", obj2.x, obj2.y);
	  
	}

	private static void rearrange(Point obj1) {
	  obj1.x=30;
	  obj1.y=40;
	}

}
