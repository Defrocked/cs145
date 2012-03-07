package Exercisec3s1;

public class PrintNumbers {
	
	public static void main(String[] args) {
		printNumbers(15);
		printNumbers(5);
	}
	
	public static void printNumbers(int maxNumber){
		String numberList = "";
		
		for (int i = 1; i <= maxNumber; i++){
			numberList = numberList + "[" + i + "] ";
		}
		System.out.println(numberList);
	}
	
}
