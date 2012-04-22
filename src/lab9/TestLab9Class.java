package lab9;

public class TestLab9Class {
	public static void main(String[] args) {
		//COUNTRY
		Country America = new Country(50000, 45.50);
		System.out.println(America.getGDP());
		America.hostOlympics();
		System.out.println(America.hostingOlympics);
		System.out.println(America.getPopulation());
		America.cancelOlympics();
		System.out.println(America.hostingOlympics);
		America.warAgainst("Canada");
		System.out.println(America.isAtWar());
		System.out.println(America.atWarWith());
		
		//RAFFLE
		
	}
}
