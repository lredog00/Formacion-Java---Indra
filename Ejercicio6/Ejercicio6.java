import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ejercicio6 {

	public static void main(String[] args) {
		System.out.println("------------------------ LISTAS ------------------------");
		List<String> productos = new ArrayList<>();
		productos.add("Agua");
		productos.add("Pan");
		productos.add("Cerveza");
		productos.add("Ron Barcelo");
		productos.add("Coca-Cola");
		productos.add("Palomitas");
		productos.add("Patatas Fritas");
		productos.add("Pipas");
		productos.add("Vasos");
		productos.add("Hielos");
		
		System.out.println("La lista es --> "+productos);
		
		System.out.println("------------------------ SET ------------------------");
		
		Set<String> equipos = new HashSet<>();
		
		equipos.add("Real Madrid");
		equipos.add("Betis");
		equipos.add("Manchester United");
		equipos.add("Manchester City");
		equipos.add("Juventus");
		equipos.add("PSG");
		equipos.add("River Plate");
		equipos.add("Boca Junior");
		equipos.add("Arsenal");
		equipos.add("Liverpool");
		
		System.out.println("La lista de equipos con la coleccion SET es --> "+equipos);
		
		
		System.out.println("------------------------ MAPAS key-value ------------------------");
		Map<String, Integer> mapNombreEdad = new HashMap<>();
		mapNombreEdad.put("Luis", 24);
		mapNombreEdad.put("Gustavo", 24);
		mapNombreEdad.put("Pedro", 22);
		mapNombreEdad.put("Juan", 17);
		mapNombreEdad.put("Maria", 37);
		mapNombreEdad.put("Nicol", 21);
		mapNombreEdad.put("Elena", 23);
		mapNombreEdad.put("Marina", 27);
		mapNombreEdad.put("Ruben", 25);
		mapNombreEdad.put("Damian", 22);
		
		for (Map.Entry<String, Integer> entry : mapNombreEdad.entrySet()) {
			String key = entry.getKey();
			int val = entry.getValue();
			
			System.out.println("Nombre: "+key+" Edad: "+val);
			
			
		}

	}

}
