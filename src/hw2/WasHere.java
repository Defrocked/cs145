package hw2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class WasHere {

	public static void main(String[] args) throws FileNotFoundException {
		//converts stuff
		convert("src/hw2/washere eg.txt", "src/hw2/kmlthing.kml");
	}

	public static void convert(String filePath, String writeTo) throws FileNotFoundException{
		//setup
		PrintWriter pw = new PrintWriter(writeTo);
		File input = new File(filePath);
		Scanner infoFinder = new Scanner(input);
		String placeName = "";
		String placeDescription = "";
		String latlong = "";
		KeyholeIO.openKML(pw);
		//loop KML placemarks
		while(infoFinder.hasNextLine()){
			placeName = infoFinder.nextLine();
			placeDescription = infoFinder.nextLine();
			latlong = infoFinder.nextLine();
			KeyholeIO.writePlacemark(pw, placeName, placeDescription, latlong);
		}
		infoFinder.close();
		KeyholeIO.closeKML(pw);
	}

}
