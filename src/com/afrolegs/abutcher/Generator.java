package com.afrolegs.abutcher;

import java.util.ArrayList;
import java.util.Random;

public class Generator {

	public static ArrayList<Shot> generateShots() {
		
		String[] rules = { "Mikey loses a roll by <=5",
				"Towellie afk's (non-break)", "Liz does <20k dps",
				"Shannon mispronounces a word",
				"Mikey says something in vent he meant to say in skype",
				"Someone dies on Ultraxion",
				"Blade rush hits 5+ people for >50k on one attampt",
				"Tim gets on vent drunk", "Someone hits the Ice Wall or Icicle",
				"Liz says \"I'm going to get another beer\"",
				"Daniel legitimately wins a roll", "Towellie talks in vent",
				"Life Grip used productively/for the benefit of the raid",
				"Rallying Cry or PW: Barrier missed",
				"Raid CD wasted on a wipe", "Shannon afk's because of kids",
				"Jeremy or Liz d/c's", "Leather agility gear drops",
				"Fuck up chaining lightning", "Patrick /lick's a boss", 
				"Jeremy hasn't accepted before raid start", "Nikki has a baby (DOUBLE)",
				"a rogue has to pickpocket Hagara", "a rogue dies while pickpocketing Hagara (DOUBLE)",
				"Shannon complains about reforging", "Someone forgot a flask for the first boss",
				};

		ArrayList<Shot> shots = new ArrayList<Shot>();
		
		for ( String rule : rules) {
			shots.add(new Shot(rule));
		}
		return shots;
	}
	
	public static String[][] generateBoard(ArrayList<Shot> shots) {
		
		String[][] board = new String[4][4];
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				int index = new Random().nextInt(shots.size());
				board[i][j] = (shots.get(index)).getRule();
				shots.remove(index);
			}
		}
		
		return board;
	}
	
	public static void printBoard(String[][] board) {
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(board[i][j] + "\t\t");
			}
			System.out.print("\n");
		}	
	}
	
	public static void main(String[] args) {
		printBoard(generateBoard(generateShots()));
	}
}
