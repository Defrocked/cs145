package lab9;

import java.util.ArrayList;
import java.util.Random;

public class Raffle {
	private int maxPeople;
	private ArrayList<String> raffle;
	
	public Raffle(int maxContestants){
		maxPeople = maxContestants;
		raffle = new ArrayList<String>();
	}
	
	public void addContestant(String name){
		if (raffle.size() != maxPeople){
			raffle.add(name);
		}else{
			System.out.println("You're at the maximum number of raffle contestants");
		}
		
	}
	
	public void drawTicket(){
		Random generator = new Random();
		int winner = generator.nextInt(raffle.size());
		System.out.println(raffle.get(winner) + " is the winner of the raffle!");
		raffle.remove(winner);
	}
	
}
