import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import org.json.*;

public class Principal {

	public static void main(String[] args) throws IOException {
		
		
		
		try {
			String ruta =  "C:\\Users\\luis-\\Desktop\\ModeloExamen2\\recomendacion_diaria.txt";
			File file = new File(ruta);
			FileWriter fw = new FileWriter(file);
			
			BufferedWriter bw = new BufferedWriter(fw);
			
			
			URL urlTempMadrid = new URL("https://api.open-meteo.com/v1/forecast?latitude=40.42&longitude=-3.70&current_weather=true&forecast_days=1");
			URL urlTempBerlin = new URL("https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&current_weather=true&forecast_days=1");
		
			HttpURLConnection con = (HttpURLConnection) urlTempMadrid.openConnection();
			HttpURLConnection con2 = (HttpURLConnection) urlTempBerlin.openConnection();
			
			int timeout = con.getResponseCode();
			
			if(timeout!=200) {
				throw new RuntimeException("HttpResponseCode "+timeout);
			}else {
				StringBuilder informacion = new StringBuilder();
				Scanner sc = new Scanner(urlTempMadrid.openStream());
				while(sc.hasNext()) {
					informacion.append(sc.nextLine());
				}
				sc.close();
				
				System.out.println(informacion);
				String salidaAPI = informacion.toString();
				
				JSONObject json = new JSONObject(salidaAPI);
				
				
				JSONObject ob2 = (JSONObject) json.get("current_weather");
				String stringTemperature = ob2.get("temperature").toString();
				
				double temperature = Double.parseDouble(stringTemperature);
				
				System.out.println("La temperatura de Madrid es de "+temperature+" ºC");
				bw.write("La temperatura de Madrid es de "+temperature+" ºC \n");
				if(temperature<15.0) {
					System.out.println("Se realiza la producción y el sembrado");
					bw.write("Se realiza la producción y el sembrado");
				}else {
					System.out.println("En Madrid solo se puede realizar la producción");
					bw.write("En Madrid solo se puede realizar la producción");
				}
				bw.write("\n\n");
			}
			
			
			int timeoutCon2 = con2.getResponseCode();
				
			if(timeoutCon2!=200) {
				throw new RuntimeException("HttpResponseCode "+timeoutCon2);
			}else {
				StringBuilder informacionBerlin = new StringBuilder();
				Scanner sc = new Scanner(urlTempBerlin.openStream());
				while(sc.hasNext()) {
					informacionBerlin.append(sc.nextLine());
				}
				sc.close();
				
				System.out.println(informacionBerlin);
				String salidaAPIBerin = informacionBerlin.toString();
				
				JSONObject jsonBerlin = new JSONObject(salidaAPIBerin);
				JSONObject ob2 = (JSONObject) jsonBerlin.get("current_weather");
				String stringTemperature = ob2.get("temperature").toString();
				
				double temperature = Double.parseDouble(stringTemperature);
				
				System.out.println("La temperatura de Berlin es de "+temperature+" ºC\n");
				bw.write("La temperatura de Berlin es de "+temperature+" ºC\n");
				if(temperature<20.0) {
					System.out.println("Se realizan tareas de mantenimiento");
					bw.write("Se realizan tareas de mantenimiento");
				}else {
					System.out.println("En Berlin solo se realizará la producción");
					bw.write("En Berlin solo se realizará la producción");
				}
			}
			bw.close();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
