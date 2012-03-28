package hw2;

import java.io.PrintWriter;

public class KeyholeIO {

	public static void openKML(PrintWriter pw) {
		//writes the beginning KML stuff
		
		// <?xml version="1.0" encoding="UTF-8"?>
		// <kml xmlns="http://www.opengis.net/kml/2.2">
		// <Document>
		// <Style
		// id="seethrough"><PolyStyle><color>7fffffff</color></PolyStyle></Style>
		pw.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
		pw.println("<kml xmlns=\"http://www.opengis.net/kml/2.2\">");
		pw.println("<Document>");
		pw.println("<Style id=\"seethrough\"><PolyStyle><color>7fffffff</color></PolyStyle></Style>");
	}

	public static void closeKML(PrintWriter pw) {
		//writes the ending KML stuff
		
		// </Document>
		// </kml>
		pw.println("</Document>");
		pw.println("</kml>");
	}

	public static void writePin(PrintWriter pw, String placeName, String placeDescription, String latlong){
		//writes for a pin KML
		
//		<!-- A pin placemark -->
//		<Placemark>
//		<name>NAME</name>
//		<description>DESCRIPTION</description>
//		<Point>
//		<coordinates>LAT0,LON0</coordinates>
//		</Point>
//		</Placemark>
		pw.println("<!-- A pin placemark -->");
		pw.println("<Placemark>");
		pw.println("<name>" + placeName + "</name>");
		pw.println("<description>" + placeDescription + "</description>");
		pw.println("<Point>");
		pw.println("<coordinates>" + latlong + "</coordinates>");
		pw.println("</Point>");
		pw.println("</Placement>");
	}

	public static void writeLine(PrintWriter pw, String placeName, String placeDescription, String latlong) {
		//writes for a line KML
		
//		<!-- A line placemark -->
//		<Placemark>
//		<name>NAME</name>
//		<description>DESCRIPTION</description>
//		<LineString>
//		<tessellate>1</tessellate>
//		<coordinates>LAT0,LON0 LAT1,LON1 LAT2,LON2 ...</coordinates>
//		</LineString>
//		</Placemark>
		pw.println("<!-- A line placemark -->");
		pw.println("<Placemark>");
		pw.println("<name>" + placeName + "</name>");
		pw.println("<description>" + placeDescription + "</description>");
		pw.println("<LineString>");
		pw.println("<tessellate>1</tessellate>");
		pw.println("<coordinates>" + latlong + "</coordinates>");
		pw.println("</LineString>");
		pw.println("</Placement>");
	}

	public static void writeRegion(PrintWriter pw, String placeName, String placeDescription, String latlong) {
		//writes for a region KML
		
//		<!-- A region placemark -->
//		<Placemark>
//		<name>NAME</name>
//		<description>DESCRIPTION</description>
//		<styleUrl>#seethrough</styleUrl>
//		<Polygon>
//		<outerBoundaryIs>
//		<LinearRing>
//		<coordinates>LAT0,LON0 LAT1,LON1 LAT2,LON2 ...</coordinates>
//		</LinearRing>
//		</outerBoundaryIs>
//		</Polygon>
//		</Placemark>
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
		//writes stuff using the other methods
		if(1){
			writePin(pw, placeName, placeDescription, latlong);
		}else if(2){
			writeRegion(pw, placeName, placeDescription, latlong);
		}else{
			writeLine(pw, placeName, placeDescription, latlong);
		}
	}
}
