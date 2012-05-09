package hw2;

import java.io.PrintWriter;

public class KeyholeIO {

	public static void openKML(PrintWriter pw) {
		// writes the beginning KML stuff
		pw.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		pw.println("<kml xmlns=\"http://www.opengis.net/kml/2.2\">");
		pw.println("<Document>");
		pw.println("<Style id=\"seethrough\"><PolyStyle><color>7fffffff</color></PolyStyle></Style>");
	}

	public static void closeKML(PrintWriter pw) {
		// writes the ending KML stuff
		pw.println("</Document>");
		pw.println("</kml>");
	}

	public static void writePin(PrintWriter pw, String placeName, String placeDescription, String latlong) {
		// writes for a pin KML
		pw.println("<!-- A pin placemark -->");
		pw.println("<Placemark>");
		pw.println("<name>" + placeName + "</name>");
		pw.println("<description>" + placeDescription + "</description>");
		pw.println("<Point>");
		pw.println("<coordinates>" + latlong + "</coordinates>");
		pw.println("</Point>");
		pw.println("</Placemark>");
	}

	public static void writeLine(PrintWriter pw, String placeName, String placeDescription, String latlong) {
		// writes for a line KML
		pw.println("<!-- A line placemark -->");
		pw.println("<Placemark>");
		pw.println("<name>" + placeName + "</name>");
		pw.println("<description>" + placeDescription + "</description>");
		pw.println("<LineString>");
		pw.println("<tessellate>1</tessellate>");
		pw.println("<coordinates>" + latlong + "</coordinates>");
		pw.println("</LineString>");
		pw.println("</Placemark>");
	}

	public static void writeRegion(PrintWriter pw, String placeName, String placeDescription, String latlong) {
		// writes for a region KML
		pw.println("<!-- A region placemark -->");
		pw.println("<Placemark>");
		pw.println("<name>" + placeName + "</name>");
		pw.println("<description>" + placeDescription + "</description>");
		pw.println("<styleUrl>#seethrough</styleUrl>");
		pw.println("<Polygon>");
		pw.println("<outerBoundaryIs>");
		pw.println("<LinearRing>");
		pw.println("<coordinates>" + latlong + "</coordinates>");
		pw.println("</LinearRing>");
		pw.println("</outerBoundaryIs>");
		pw.println("</Polygon>");
		pw.println("</Placemark>");
	}

	public static void writePlacemark(PrintWriter pw, String placeName, String placeDescription, String latlong) {
		//counts the number of commas
		String s = latlong;
		int charCount = s.replaceAll("[^,]", "").length();
		//checks to see if the first and last coord is the same
		String[] t = s.split(" ");
		boolean comparison = false;
		if (t[0].equals(t[t.length-1])) {
			comparison = true;
		}
		//makes a new string that cuts off the last coord if it was the same
		String newString = "";
		if (comparison) {
			newString = t[0];
			for (int i = 1; i <= t.length-2; i++) {
				newString += " " + t[i];
			}
		}
		//writes stuff using the other methods
		if(charCount == 1){
			writePin(pw, placeName, placeDescription, latlong);
		}else if(charCount > 1 && comparison){
			writeRegion(pw, placeName, placeDescription, newString);
		}else{
			writeLine(pw, placeName, placeDescription, latlong);
		}
	}
}
