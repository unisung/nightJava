package ch03;
/***
 * 클래스의 3요소: 필드,생성자,메소드
 * */
public class PhysicalInfo {
	//필드
	private String name;
	private int age;
	private float height,weight;
	//no-argsConstructor(매개변수없는 생성자,기본생성자-default생성자)	
    public PhysicalInfo() {}
    /**
     * 생성자 오버로딩
     * */
    //매개변수 1개짜리 생성자
    public PhysicalInfo(String name) {
    	this();//다른생성자를 호출하는 this()메소드는 반드시 첫줄에 기술해야함.
		this.name = name;
	}
   //매개변수 2개짜리 생성
    public PhysicalInfo(String name, int age) {
		this(name);
		this.age = age;
	}
    //매개변수 3개짜리 생성
    public PhysicalInfo(String name, int age, float height) {
		this( name, age);
		this.height = height;
	}
//생성자
	//매개변수 4개짜리 생성자
	public PhysicalInfo(String name, int age, float height, float weight) {
		this( name,  age, height);
		this.weight = weight;
	}
  //메소드
	//같은 이름의 메소드명에 (매개변수의 타입,숫자,순서-메소드의 signature)가 다른경우)
	///java는 서로 다른 메소드로간주..-메소드의 오버로딩
	void update(int age){
		this.age=age;
	}
	void update(int age,float height) {
		 update(age);
		this.height=height;
	}
	void update(int age, float height, float weight){
		update(age,height);
		this.weight=weight;
	}
	//getters/setters
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public float getHeight() {
		return height;
	}
	public float getWeight() {
		return weight;
	}
	

	
	
}
