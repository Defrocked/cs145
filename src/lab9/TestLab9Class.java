package lab9;

public class TestLab9Class {
	public static void main(String[] args) {
		//COUNTRY
		System.out.println("COUNTRY");
		Country America = new Country(50000, 45.50);
		System.out.println(America.getGDP());
		America.hostOlympics();
		System.out.println(America.isHostingOlympics());
		System.out.println(America.getPopulation());
		America.cancelOlympics();
		System.out.println(America.isHostingOlympics());
		America.warAgainst("Canada");
		System.out.println(America.isAtWar());
		System.out.println(America.atWarWith());
		
		
		System.out.println("");
		
		//RAFFLE
		System.out.println("RAFFLE");
		Raffle Contest = new Raffle(5);
		Contest.addContestant("Amy");
		Contest.addContestant("Jon");
		Contest.addContestant("Andrew");
		Contest.addContestant("Kaleb");
		Contest.addContestant("Mikey");
		Contest.drawTicket();
	}
}
