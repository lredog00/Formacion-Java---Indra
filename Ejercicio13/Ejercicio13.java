import org.json.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Instant;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import java.io.IOException;
import java.net.MalformedURLException;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Ejercicio13 {
	public static void main(String[] args) throws IOException 
	{
		
		
		try {
		URL url = new URL ("https://api.thecatapi.com/v1/images/0XYvRd7oD");
		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.connect();
		int tiempoDeRepuesta = con.getResponseCode();
		if (tiempoDeRepuesta != 200) //200 es el tiempo de respuesta correcto.
		{
			throw new RuntimeException("HttpResponseCode " + tiempoDeRepuesta);
		}
		else
		{
			StringBuilder informacion = new StringBuilder();
			Scanner sc = new Scanner(url.openStream());
			while (sc.hasNext())
			{
				informacion.append(sc.nextLine());
			}
			sc.close();	
			
			System.out.println(informacion);
			String salidaAPI = informacion.toString();
			
			JSONObject json = new JSONObject(salidaAPI);
			String dirURL = json.get("url").toString();
			
			
			URL urlImg = new URL(dirURL);
			Image image = ImageIO.read(urlImg);
			
			Image resizedImage = image.getScaledInstance(300, 300, Image.SCALE_SMOOTH);
			ImageIcon imageIcon = new ImageIcon(resizedImage);
			JFrame jFrame = new JFrame();
			JLabel label = new JLabel(new ImageIcon(resizedImage));
			
			
			
			jFrame.setBackground(Color.blue);
			System.out.println(jFrame.getBackground());
			jFrame.setTitle("Gatos");
			jFrame.setLayout(new FlowLayout());
			jFrame.setSize(500, 500);
			JLabel labelTexto = new JLabel("Imagen del Gato -->");
			labelTexto.setSize(30,30);
			
			jFrame.add(labelTexto);
			jFrame.add(label);
			jFrame.setIconImage(image);
			
			
			jFrame.setVisible(true);
			jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			
			
		}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
}


