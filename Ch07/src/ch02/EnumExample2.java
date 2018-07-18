package ch02;

public class EnumExample2 {
	public static void main(String[] args) {
		printSeason(Season.SPRING);
		printSeason(Season.SUMMER);
		printSeason(Season.FALL);
		printSeason(Season.WINER);
	}

	private static void printSeason(Season season) {
	  System.out.println(season.value());
		
	}

}
