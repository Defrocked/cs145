package hw3;

import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class Image {

	private Color[][] colour;
	private int w;
	private int h;

	/**
	 * creates a 2 dimensional array with dimensions width, height
	 * 
	 * @param width
	 * @param height
	 */
	public Image(int width, int height) {
		w = width;
		h = height;
		colour = new Color[width][height];
	}

	/**
	 * uses a fillColour to blanket the entire 2D array one colour
	 * 
	 * @param fillColour
	 */
	public void fill(Color fillColour) {
		for (int i = 0; i < colour.length; i++) {
			for (int j = 0; j < colour[i].length; j++) {
				colour[i][j] = fillColour;
			}
		}
	}

	/**
	 * places a coloured dot at the indexed location col,row
	 * 
	 * @param dotColour
	 * @param col
	 * @param row
	 */
	public void dot(Color dotColour, int col, int row) {
		colour[col][row] = dotColour;
	}

	/**
	 * writes a PPM file to use in an image editor using the RGB values that the
	 * colour 2D array contains
	 * 
	 * @param out2
	 * @throws FileNotFoundException
	 */
	public void writeToPPM(PrintStream out2) throws FileNotFoundException {
		PrintWriter out = new PrintWriter(out2);
		out.println("P3");
		out.println(w + " " + h);
		out.println("255");
		for (int k = 0; k < colour.length; k++) {
			for (int l = 0; l < colour[k].length; l++) {
				out.println(colour[k][l].getRed() + " "
						+ colour[k][l].getGreen() + " "
						+ colour[k][l].getBlue());
			}
		}
		out.close();
	}
}
