package ch07;

public class InterfaceExample1 {

	public static void main(String[] args) {
		SeparateVolume obj1 
		 = new SeparateVolume("863744개", "개미","베르베르");
		AppCDInfo obj2 = new AppCDInfo("2005-7001", "Redhat Fedora");
		
		obj1.checkOut("홍길동", "20180717");
		obj2.checkOut("일지매", "20180705");
		
		obj1.checkIn();
		obj2.checkIn();
	}
}
