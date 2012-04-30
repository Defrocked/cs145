package hw3;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import pre3.PostOps;

public class Paragraph {

	
	
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
		Color fillColor = new Color(Integer.parseInt(r), Integer.parseInt(g), Integer.parseInt(b),1);
		Image image = new Image(Integer.parseInt(w), Integer.parseInt(h));
		image.fill(fillColor);
		
		while(in.hasNextLine()){
			String t2 = in.nextLine();
			if(t2.charAt(0) == '#' || t2 == ""){
				t2 = in.nextLine();
			}else{
				plot(image, t2);
			}
		}
		
		//image.writeToPPM("src/hw3/hw3ppm.ppm");
		}
	
	public static void  plot(Image image, String instructions){
		
		String[] temp = instructions.split(",");
		String bP = temp[2];
		String eP = temp[3];
		String xExp = temp[0];
		String yExp = temp[1];
		String deltaP = temp[4];
		String red = temp[5];
		String green = temp[6];
		String blue = temp[7];
		
		for (int p = Integer.parseInt(bP); p < Integer.parseInt(eP); p = p + Integer.parseInt(deltaP)){
			Color c = new Color(Integer.parseInt(red), Integer.parseInt(green), Integer.parseInt(blue));
			String tp = "" + p;
			xExp = xExp.replace("p", tp);
			yExp = yExp.replace("p", tp);
			image.dot(c, (int)PostOps.evaluate(xExp), (int)PostOps.evaluate(xExp));
		}
				
		
	}
}
