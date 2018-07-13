package ch02;
/*
 * 객체 - 속성(필드)+기능(메소드)
 * */
public class Circle {
   //필드
	//private 접근지정자는 외부에 접근불가
   private double radius;
   //생성자
	Circle(double radius){
		this.radius=radius;
	}
	
   //메소드-면적구하는메소드
	double getArea() {
		double area;
		area = radius * radius * 3.14;
		return area;
	}
	//Shift + Alt +s
	//public은 외부에서 접근허용에 제한이 없음
	public double getRadius() {
		return radius;
	}
   
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
}
