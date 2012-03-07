package Selfcheckc3s13;

import java.util.*;

public class PrintReverse {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("type input:");
		String text = in.nextLine();
		printReverse(text);
	}

	public static void printReverse(String text) {
		String reversed = "";
		if (text.isEmpty() == false) {
			for (int i = text.length() - 1; i >= 0; i = i - 1) {
				char textChar = text.charAt(i);
				reversed = reversed + textChar;
			}
		} else {
			System.out.println(text);
		}
		System.out.println(reversed);
	}
}
