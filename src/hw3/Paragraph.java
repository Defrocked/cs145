package hw3;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import pre3.PostOps;

public class Paragraph {

	/**
	 * reads the input, does the initial start then moves into a plot loop
	 * disregards '#' or empty strings writes the completed image to a ppm file
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
		File input = new File("src/hw3/hw3ex.txt");
		Scanner in = new Scanner(input);
		String t = in.nextLine();
		String s[] = t.split(" ");
		String w = s[0];
		String h = s[1];
		String r = s[2];
		String g = s[3];
		String b = s[4];
		Color fillColor = new Color(Integer.parseInt(r), Integer.parseInt(g),
				Integer.parseInt(b), 1);
		Image image = new Image(Integer.parseInt(w), Integer.parseInt(h));
		image.fill(fillColor);

		while (in.hasNextLine()) {
			String t2 = in.nextLine();
			if (t2.startsWith("#") || t2.isEmpty()) {
				t2 = in.nextLine();
			} else {
				plot(image, t2);
			}
		}

		image.writeToPPM("src/hw3/hw3ppm.ppm");
	}

	/**
	 * does some ridiculously complicated string shenanigans where there is
	 * probably a far mor eloquent solution evaluates p expressions, clamps if
	 * above 512 or below 0 plots colors to the correct 2D array index locations
	 * as found by the evaluated p expressions
	 * 
	 * @param image
	 * @param instructions
	 */
	public static void plot(Image image, String instructions) {

		String[] temp = instructions.split(",");
		String bP = temp[2];
		String eP = temp[3];
		String xExp = temp[0];
		String yExp = temp[1];
		String deltaP = temp[4];
		String red = temp[5];
		String green = temp[6];
		String blue = temp[7];

		for (double p = Double.parseDouble(bP); p < Double.parseDouble(eP); p = p
				+ Double.parseDouble(deltaP)) {
			Color c = new Color(Integer.parseInt(red), Integer.parseInt(green),
					Integer.parseInt(blue));
			String tp = "" + p;
			xExp = xExp.replace("p", tp);
			yExp = yExp.replace("p", tp);
			int x = (int) PostOps.evaluate(xExp);
			int y = (int) PostOps.evaluate(yExp);
			if (x > 511) {
				x = 511;
			} else if (x < 0) {
				x = 0;
			}
			if (y > 511) {
				y = 511;
			} else if (y < 0) {
				y = 0;
			}
			image.dot(c, x, y);
			xExp = xExp.replace(tp, "p");
			yExp = yExp.replace(tp, "p");
		}
	}
}
