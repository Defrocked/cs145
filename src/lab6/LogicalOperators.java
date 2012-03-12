package lab6;

import java.util.*;

public class LogicalOperators {

	public static void main(String[] args) {
		//variables available
		int ageInYears = 0;
		int salaryInDollars = 0;
		boolean isMale = true;
		int kidCount = 0;
		boolean isMarried = false;
		double avgWeeklyHoursWorked = 0;
		int birthMonth = 0;
		int birthYear = 0;
		boolean drinksCoffee = false;
		
		//logical operators Checkpoint 1
		boolean isBenefitsEligible = avgWeeklyHoursWorked >= 20;
		boolean isTeenager = birthYear >= 1999 && birthYear <= 1993;
		boolean isBachelor = !isMarried;
		boolean isBusy = kidCount >= 1 || avgWeeklyHoursWorked > 45;
		boolean notBornInOctober1990 = birthMonth == 10 && birthYear == 1990;
		boolean goesToStarbucks = drinksCoffee == true || salaryInDollars > 30000;
		boolean canHaveChildren =  isMale == true || (!isMale && birthYear >= 1967 && !drinksCoffee);
	
		//conditionals Checkpoint 2
		getOdds();
	}
	
	public static void getOdds(){
		//rolls 1-6 a lot and then prints out the results
		Random generator = new Random();
		int rollCount = 100000;
		int whatNumber = 0;
		int ones = 0;
		int twos = 0;
		int threes = 0;
		int fours = 0;
		int fives = 0;
		int sixes = 0;
		int total = 0;
		for(int i = 0; i < rollCount; i++){
			whatNumber = generator.nextInt(6) + 1;
			if(whatNumber == 1){
				ones = ones + 1;
			}else if(whatNumber == 2){
				twos = twos + 1;
			}else if(whatNumber == 3){
				threes = threes + 1;
			}else if(whatNumber == 4){
				fours = fours + 1;
			}else if(whatNumber == 5){
				fives = fives + 1;
			}else{
				sixes = sixes + 1;
			}
			total = total + 1;
		}
		System.out.println("Ones:   " + ones);
		System.out.println("Twos:   " + twos);
		System.out.println("Threes: " + threes);
		System.out.println("Fours:  " + fours);
		System.out.println("Fives:  " + fives);
		System.out.println("Sixes:  " + sixes);
		System.out.println("Total:  " + total);
		
	}

}
