package ch01;

public class ConcatExample1 {
	public static void main(String[] args) {
		String str1 = "num="+3+4;//"num="+"3"+4 ->"num=3"+4->"num=34"
		String str2 = 3+4+"=num";//3+4+"=num"->7+"=num"->"7"+"=num"->"7=num"
		System.out.println(str1);
		System.out.println(str2);

	}

}
