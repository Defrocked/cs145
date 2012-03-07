package lab4;

import java.util.*;
import java.awt.AWTException;
import java.awt.Robot;

public class Username {
	public static void main(String[] args) throws AWTException {
		// composeUsername
		System.out.println("USERNAME:");
		String firstName = "Michael";
		String lastName = "Beauchamp";
		System.out.println(composeUsername(firstName, lastName));

		// getTriangleArea
		System.out.println("TRIANGLE AREA:");
		double base = 10;
		double height = 5;
		System.out.println(getTriangleArea(base, height));

		// generateWeather
		System.out.println("WEATHER STUFF:");
		System.out.println(generateWeather());
		
		//moveMouse
		System.out.println("MOUSE COORDINATES:");
		Random gen2 = new Random();
		int spotA = gen2.nextInt(1000) + 1;
		int spotB = gen2.nextInt(1000) + 1;
		System.out.println("X: " + spotA);
		System.out.println("Y: " + spotB);
		moveMouse(spotA,spotB);
		
		//getStatusBar
		System.out.println("STATUS BAR:");
		Random gen1 = new Random();
		int percentage = gen1.nextInt(100) + 1;
		System.out.print(getStatusBar(percentage));
		//System.out.println(percentage);
	}
	
	public static String getStatusBar(int number){
		String progressBar = "";
		for (int i = 0; i < number; i++){
			progressBar = progressBar + "*";
		}
		return progressBar;
	}
	
	public static void moveMouse(int a, int b) throws AWTException{
		Robot bot1 = new Robot();
		bot1.mouseMove(a, b);
		
	}
	
	public static String generateWeather() {
		Random generator = new Random();
		int tempA = generator.nextInt(100) + 1;
		int tempB = generator.nextInt(100) + 1;
		int raining = generator.nextInt(1);
		tempA = (tempA + tempB) - (tempA + 1); 
		boolean isRaining = raining == 1;
		return "High temp: " + tempB + ". Low temp: " + tempA + ". Is it raining? " + isRaining;
//		int highTemp;
//		int lowTemp;
//		if (tempA > tempB){
//			highTemp = tempA;
//			lowTemp = tempB;
//		} else {
//			highTemp = tempB;
//			lowTemp = tempA;
//		}
//		boolean isRaining;
//		isRaining = raining == 1 ;
//		String printRain;
//		if (isRaining = true){
//			printRain = "It is raining.";
//		} else {
//			printRain = "It is not raining.";
//		}
//		return "High temp: " + highTemp + ". Low temp: " + lowTemp + ". " + printRain;
	}

	public static double getTriangleArea(double base, double height) {
		return .5 * base * height;
	}

	public static String composeUsername(String firstName, String lastName) {
		firstName = firstName.toLowerCase();
		lastName = lastName.toLowerCase();
		char firstInitial = firstName.charAt(0);
		return "<" + lastName + "><" + firstInitial + ">";
	}
}
