import java.io.IOException;
import java.net.HttpURLConnection; //Para conectarse a la API
import java.net.MalformedURLException;
import java.net.URL; //El manejo de URLs
import java.util.Scanner;
import org.json.*;
public class APIRest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			URL url = new URL("https://v2.jokeapi.dev/joke/Programming?lang=es&blacklistFlags=political");
			
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
				System.out.println("Joke");
				if(json.get("type").equals("single")) {
					System.out.println(json.get("joke"));
				}else {
					
					System.out.println(json.get("setup"));
					System.out.println(json.get("delivery"));
				}
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
