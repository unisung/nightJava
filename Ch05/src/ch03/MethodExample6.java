package ch03;

//메소드의 오버로딩 활용
//동일한 이름의 메소드들 중에서
//입력받는 매개변수의 갯수에 따라
//java가 판단해서 해당메소드를 찾아서 호출함.
public class MethodExample6 {
	public static void main(String[] args) {
	  PhysicalInfo obj;
	  obj = new PhysicalInfo("해리", 10, 132.0f, 35.0f);
	  printPhysicalInfo(obj);
	  obj.update(11, 145.0f, 45.0f);
	  printPhysicalInfo(obj);
	  obj.update(12,157.0f);
	  printPhysicalInfo(obj);
	  obj.update(13);
	  printPhysicalInfo(obj);

	}

	private static void printPhysicalInfo(PhysicalInfo obj) {
		System.out.println("이름:"+obj.getName());
		System.out.println("나이:"+obj.getAge());
		System.out.println("키:"+obj.getHeight());
		System.out.println("몸무게:"+obj.getWeight());
		
	}

}
