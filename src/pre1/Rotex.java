package pre1;
import java.util.*;
public class Rotex {
	public static void main(String[] args) {
		//setup
		System.out.print("Message: ");
		Scanner in = new Scanner(System.in);
		String inputString = in.nextLine();
		inputString = inputString.toUpperCase();
		String rotatedMessage = "";
		//change letters
		rotatedMessage = lolIfStatement(inputString);
		//print dat shit
		System.out.println("Rotated: " + rotatedMessage);
	}
	public static String lolIfStatement(String inputString){
		//setup
		char charAtChar;
		char rotatedChar = 'a';
		String rotatedMessage = "";
		//for loop to go through the string index to rotate chars
		for (int i = 0; i < inputString.length(); i++){
			charAtChar = inputString.charAt(i);
			//dat if
			if (charAtChar == 'A'){
				rotatedChar = 'n';
			} else if (charAtChar == 'B') {
				rotatedChar = 'o';
			} else if (charAtChar == 'C') {
				rotatedChar = 'p';
			} else if (charAtChar == 'D') {
				rotatedChar = 'q';
			} else if (charAtChar == 'E') {
				rotatedChar = 'r';
			} else if (charAtChar == 'F') {
				rotatedChar = 's';
			} else if (charAtChar == 'G') {
				rotatedChar = 't';
			} else if (charAtChar == 'H') {
				rotatedChar = 'u';
			} else if (charAtChar == 'I') {
				rotatedChar = 'v';
			} else if (charAtChar == 'J') {
				rotatedChar = 'w';
			} else if (charAtChar == 'K') {
				rotatedChar = 'x';
			} else if (charAtChar == 'L') {
				rotatedChar = 'y';
			} else if (charAtChar == 'M') {
				rotatedChar = 'z';
			} else if (charAtChar == 'N') {
				rotatedChar = 'a';
			} else if (charAtChar == 'O') {
				rotatedChar = 'b';
			} else if (charAtChar == 'P') {
				rotatedChar = 'c';
			} else if (charAtChar == 'Q') {
				rotatedChar = 'd';
			} else if (charAtChar == 'R') {
				rotatedChar = 'e';
			} else if (charAtChar == 'S') {
				rotatedChar = 'f';
			} else if (charAtChar == 'T') {
				rotatedChar = 'g';
			} else if (charAtChar == 'U') {
				rotatedChar = 'h';
			} else if (charAtChar == 'V') {
				rotatedChar = 'i';
			} else if (charAtChar == 'W') {
				rotatedChar = 'j';
			} else if (charAtChar == 'X') {
				rotatedChar = 'k';
			} else if (charAtChar == 'Y') {
				rotatedChar = 'l';
			} else if (charAtChar == 'Z') {
				rotatedChar = 'm';
			} else {
				rotatedChar = charAtChar;
			}
			rotatedMessage = rotatedMessage + rotatedChar;
		}
		return rotatedMessage;
	}
}
