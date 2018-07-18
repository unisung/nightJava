package ch01;

public class StringBuilderExample {
	public static void main(String[] args) {
	StringBuilder sb = new StringBuilder("역사를 하노라고 맨땅을 파다가");
	System.out.println(sb);
	System.out.println(sb.append("커다란 고인돌을 끄집어 내어놓고 보니"));
	System.out.println(sb.insert(26, "하나 "));
	
	for(int i=0;i<sb.length();i++)
	 System.out.println(i+","+sb.charAt(i));
	
	System.out.println(sb.delete(21, 23));// 21<=범위<23
	System.out.println(sb.deleteCharAt(9));//index번호 9인 문자를 삭제
	

	}

}
