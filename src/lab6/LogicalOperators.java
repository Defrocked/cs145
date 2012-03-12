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
	}
	
}
