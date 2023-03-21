import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Ejercicio9 {

	public static void main(String[] args) {
		String ruta = "C:\\Users\\laredondo\\Desktop\\TXTNombres.txt";
		Set<String> listaNombres = new HashSet<>();

		try {
			File doc = new File(ruta);		
			BufferedReader obj = new BufferedReader(new FileReader(doc));
			String caracteres;
			
			while((caracteres = obj.readLine()) != null) {
				listaNombres.add(caracteres);
			}
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		for(String nombres : listaNombres) {
			System.out.println(nombres);
		}

		/*try {
			Scanner sc = new Scanner(new File(ruta));
			while(sc.hasNextLine()) {
				
				listaNombres.add(sc.nextLine());
				
				
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		*/
		
	}

}
