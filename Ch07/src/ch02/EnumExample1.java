package ch02;

public class EnumExample1 {
	public static void main(String[] args) {
		Day days[] = Day.values();
		for(int i=0;i<days.length;i++)
			System.out.println(days[i]);
		
		for(Day d:days) {
			System.out.println(d);
		}

	}

}
