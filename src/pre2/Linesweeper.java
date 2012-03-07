package pre2;

import java.util.*;

public class Linesweeper {
	public static void main(String[] args) {
		String board1 = "**   ** * ";
		play(board1);
		// System.out.println(createView(originalTest));

		// System.out.println(overwrite("mo",0, 'f'));
		// System.out.println(overwrite("boo",2,'p'));

		// System.out.println(isBombsOnly(" * ", "?? "));
		// System.out.println(isBombsOnly(" * ", " ??"));
		// System.out.println(isBombsOnly("* * ", "? ??"));
		// System.out.println(isBombsOnly("* * ", "? ? "));

		// System.out.println(isBomb("** ", 0));
		// System.out.println(isBomb("** ", 2));

		// System.out.println(clear("*   *", "?????",2));
		// System.out.println(clear(" * * ", "?????",0));
		// System.out.println(clear("***  ", "?????",4));
	}

	public static boolean isBomb(String input, int index) {
		// if a bomb is at the index, return true, else false
		return input.charAt(index) == '*';
	}

	public static String createView(String board) {
		// Create a temporary char value that stores what char
		// is at the index of i, then replaces that char with '?'
		char temp;
		for (int i = 0; i < board.length(); i++) {
			temp = board.charAt(i);
			if (temp != '?') {
				board = board.replace(temp, '?');
			}
		}
		return board;
	}

	public static boolean isBombsOnly(String board, String view) {
		// loops an if conditional looking for a match of ' ' && '?'
		// if it finds one, returns false, if it loops through the
		// board successfully, returns true
		for (int i = 0; i < board.length(); i++) {
			if ((board.charAt(i) == ' ') && (view.charAt(i) == '?')) {
				return false;
			}
		}
		return true;
	}

	public static String overwrite(String board, int index, char letter) {
		// Replaces the char at the index given on the given string
		// by making a substring for the beginning and replacing
		// the char (at 0) with the new char
		String beginning = "";
		String ending = "";
		if (index != 0) {
			beginning = board.substring(0, index);
			ending = board.substring(index + 1);
			return beginning + letter + ending;
		} else {
			ending = board.substring(index + 1);
			return letter + ending;
		}
	}

	public static String clear(String board, String view, int index) {
		// clears the index then clears to the left and right until
		// it hits a bomb on both sides
		String clearedBoard = overwrite(view, index, ' ');
		boolean clearLeft = false;
		boolean clearRight = false;
		int indexGap = 1;
		while (clearLeft == false || clearRight == false) {
			if ((index + indexGap) > (board.length() - 1)
					|| board.charAt(index + indexGap) == '*') {
				clearRight = true;
			} else {
				clearedBoard = overwrite(clearedBoard, index + indexGap, ' ');
			}
			if ((index - indexGap) < 0 || board.charAt(index - indexGap) == '*') {
				clearLeft = true;
			} else {
				clearedBoard = overwrite(clearedBoard, index - indexGap, ' ');
			}
			indexGap = indexGap + 1;
		}

		return clearedBoard;
	}

	public static boolean play(String board) {
		//starts game
		Scanner in = new Scanner(System.in);
		String view = createView(board);
		System.out.println("Linesweeper! Here's your board, guv'na");
		//primary loop for playing
		while (isBombsOnly(board, view) == false) {
			int digSite = -999;
			System.out.println(view);
			//while loops to prevent digSite from having retarded values
			while (digSite < 0 || digSite >= board.length() ) {
				 System.out.println("Dig between 0 and " + (board.length() - 1));
				 System.out.println("Dig where? ");
				 while (!in.hasNextInt()){
				 System.out.println("You have to pick an INTEGER");
				 in.next();
				 }
				 digSite = in.nextInt();
				 }
			//checks to see if you got blown up
			if (isBomb(board, digSite)) {
				view = overwrite(view, digSite, '*');
				System.out.println(view);
				System.out.println("You're worm food. Bummer.");
				return false;
			} else {
				view = clear(board, view, digSite);
			}
		}
		//yay win
		System.out.println(view);
		System.out.println("Missed it by that much. Yay.");
		return true;
	}
}
