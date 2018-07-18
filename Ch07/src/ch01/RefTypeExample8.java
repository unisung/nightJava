package ch01;

public class RefTypeExample8 {
	public static void main(String[] args) {
		
		Parent parent = new Parent();
		Child child = new Child();
		//parent가 Child타입으로 변환가능한지 체크하는 연산자
		if(parent instanceof Child)
		    child = (Child)parent;
		else
			System.out.println("변환불가");
		
	}
}
