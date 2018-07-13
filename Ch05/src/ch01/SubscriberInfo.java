package ch01;
/**
 * 클래스의 삼요소 - 속성(필드),생성자,기능(메소드)
 * */
public class SubscriberInfo {
	//속성
	String name,id,password;
	String phoneNo,address;

	public SubscriberInfo(String name, String id) {
		this.name = name;
		this.id = id;
	}
	//동일 클래스 내에서 
	//다른 생성자 호출시 this(변수)로 호출;
	//주의!반드시 명령문의 제일첫줄에 쓰야함............... 
	public SubscriberInfo(String name, String id, String password) {
		this(name,id);
		this.password = password;
	}
	//생성자
	//자바는 매개변수의 타입과 순선 갯수가 같으면 동일한 생성자로 간주
	
	SubscriberInfo(String name,String id,String password,String phoneNo){
		this(name,id,password);
		this.phoneNo=phoneNo;
	}
	public SubscriberInfo() {}

	//다른생성자로 간주(String,String,int,String)
	//signature(생성자의 시그니쳐)
	SubscriberInfo(String name,String id,int age,String phoneNo){}

	public SubscriberInfo(String name, String id, String password, String phoneNo, String address) {
		this(name, id, password, phoneNo);
		this.address = address;
	}
	
	public void changePassword(String password) {
		this.password = password;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	/*SubscriberInfo(String ,String ,String ,String ){
		this.name=name;
		this.id=id;
		this.password=password;
		this.address=address;
	}*/
	
	//Shift+Alt+S키를 동시에 눌러보세요.
	//메소드
    
}
