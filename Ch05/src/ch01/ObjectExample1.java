package ch01;

public class ObjectExample1 {
	public static void main(String[] args) {
		//객체 참조변수를 선언 StringBuffer타입의 참조변수 obj를 선언
		StringBuffer obj;//obj에는 객체의 주소번지가 들어감.현재 선언된 상태에는 null값이 있음.
		
		//참조변수에 생성된 객체를 대입
		//대입(=)을 하는 순간 obj에 new로 인해 생성된 객체의 주소번지가 대입.
		obj = new StringBuffer("Hey, Java");
		
		//변수가 참조하고있는 객체의 메소드 호출
		//참조변수.메소드();
		// 0  1  2  3  4 5  6  7  8
		//[H][e][y][,][][J][a][v][a]
		obj.deleteCharAt(1);//[H][y][,][][J][a][v][a]
		obj.deleteCharAt(1);//[H][,][][J][a][v][a]
		obj.insert(1, '1');//[H][1][,][][J][a][v][a]
		
		System.out.println(obj);

	}

}
