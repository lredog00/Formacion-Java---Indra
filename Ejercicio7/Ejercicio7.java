import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> productos = new ArrayList<>();
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Añade un producto del supermercado ");
			String producto = sc.next();
			productos.add(producto);
			
		}
		System.out.println("La lista del supermercado es --> "+productos);
		
		Set<String> documentos = new HashSet<>();
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Añade un DNI ");
			String dni = sc.next();
			documentos.add(dni);
			
		}
		System.out.println("Lista de DNIs --> "+documentos);
		
		
		Map<String, Integer> logins = new HashMap<>();
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Introduce el user name");
			String user= sc.next();
			System.out.println("Introduce el user id");
			int userID = sc.nextInt();
			
			logins.put(user, userID);
			
		}
		
		System.out.println("La lista de usuarios con su ID es la siguiente: ");
		
		for (Map.Entry<String, Integer> entry : logins.entrySet()) {
			String key = entry.getKey();
			int val = entry.getValue();
			
			System.out.println("USER_NAME: "+key+" USER_ID: "+val);
			
		}
		
		
		
	}
}
