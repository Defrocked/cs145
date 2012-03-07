package Lab3Stuff;
import java.util.*;
public class Flashcard {
	public static void main(String[] args) {
		//setup
		Random generator = new Random();
		int number1;
		int number2;
		number1 = generator.nextInt(10) + 1;
		number2 = generator.nextInt(10) + 1;
		System.out.println("What is " + number1 + " x " + number2 + " ?");
		//input
		Scanner in = new Scanner(System.in);
		int answer = in.nextInt();
		int answerChecker;
		answerChecker = number1 * number2;
		//output
		//boolean version
		boolean isCorrect;
		isCorrect = answer == answerChecker;
		System.out.println(isCorrect);
//		//if statement version
//		if (answer == answerChecker){
//			System.out.println("Correct");
//		} else {
//			System.out.println("Incorrect");
//		}
	}
}
