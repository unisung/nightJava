package ch02;

public class ClothingInfo {
	String code;
	String name;
	String material;
	/*int season;*/
	Season season;
	static final int SPRING=1;
	static final int SUMMER=2;
	static final int FALL=3;
	static final int WINTER=4;
	//생성자
	public ClothingInfo(String code, String name, String material, int season) {
		this.code = code;
		this.name = name;
		this.material = material;
		
	}
	
	public ClothingInfo(String code, String name, String material, Season season) {
		this.code = code;
		this.name = name;
		this.material = material;
		this.season = season;
	}
	
	
	

}
