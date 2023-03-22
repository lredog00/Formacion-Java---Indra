import java.io.IOException;
import java.net.HttpURLConnection; //Para conectarse a la API
import java.net.MalformedURLException;
import java.net.URL; //El manejo de URLs
import java.util.Scanner;
import org.json.*;

public class ApiRestEj11 {

	public static void main(String[] args) throws IOException{
		try {
			URL url = new URL("https://rickandmortyapi.com/api");
			
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.connect();
			
			int timeout = con.getResponseCode();
			
			if(timeout!=200) {
				
				throw new RuntimeException("HttpResponseCode "+timeout);
				
			}else {
				StringBuilder informacion = new StringBuilder();
				Scanner sc = new Scanner(url.openStream());
				while(sc.hasNext()) {
					informacion.append(sc.nextLine());
				}
				sc.close();
				
				System.out.println(informacion);
				
				String salidaAPI = informacion.toString();
				
				JSONObject json = new JSONObject(salidaAPI);
				
				//Characters
				System.out.println("Characters");
				URL urlChar = new URL(json.get("characters").toString());
				HttpURLConnection conChar = (HttpURLConnection) urlChar.openConnection();
				conChar.connect();
				StringBuilder characters = new StringBuilder();
				Scanner sc2 = new Scanner(urlChar.openStream());
				while(sc2.hasNext()) {
					characters.append(sc2.nextLine());
				}
				sc2.close();
				
				System.out.println(characters);
				
				//Locations
				System.out.println("Locations");
				URL urlLoc = new URL(json.get("locations").toString());
				HttpURLConnection conLoc = (HttpURLConnection) urlLoc.openConnection();
				conLoc.connect();
				StringBuilder locations = new StringBuilder();
				Scanner sc3 = new Scanner(urlLoc.openStream());
				while(sc3.hasNext()) {
					locations.append(sc3.nextLine());
				}
				sc3.close();
				
				System.out.println(locations);
				
				
				
				//Episodies
				System.out.println("episodes");
				URL urlEpi = new URL(json.get("episodes").toString());
				HttpURLConnection conEpi = (HttpURLConnection) urlEpi.openConnection();
				conEpi.connect();
				StringBuilder episodies = new StringBuilder();
				Scanner sc4 = new Scanner(urlEpi.openStream());
				while(sc4.hasNext()) {
					episodies.append(sc4.nextLine());
				}
				sc4.close();
				
				System.out.println(episodies);
				
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
