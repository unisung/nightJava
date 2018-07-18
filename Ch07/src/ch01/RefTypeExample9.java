package ch01;

public class RefTypeExample9 {
	public static void main(String[] args) {
	  Parent parent = new Parent();
	  parent.name="parent";
	  parent.say();
	  
	  Child child = new Child();
	  child.name="child";
	  child.say();
	//상속의 특징
	 //상속받은 자식의 클래스에서
	  //재정의된 메소드는 부모클래스로 
	  //프로모션되어도 재정의된 자식 메소드가 실행.
	  //필드도 자식클래스에서 새로운값이
	  //대입이 되면 새로운값으로 바뀜
	  parent = child;
	  parent.say();
	  
	  child = (Child)parent;
	  child.say();
	  
	  
	}
}
