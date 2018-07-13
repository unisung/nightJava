package ch02;

public class FieldExample2 {
	public static void main(String[] args) {
		//외부로부터 필드에 직접접근을 막고
		//반드시 메소드를 통해서 접근하도록 하는
		//방식-캡슐화
		Circle obj = new Circle(0.0);
		//obj.radius = 5.0;
		obj.setRadius(5.0);
		
		double area = obj.getArea();
		//System.out.println(obj.radius);
		System.out.println(obj.getRadius());
		System.out.println(area);
	}
}
