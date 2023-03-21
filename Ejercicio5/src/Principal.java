import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Principal {
	

	
	public static void main(String[] args) {
		
		LocalDateTime fechaHoraActual = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"); 
        String fechaHoraActualFormateada = fechaHoraActual.format(formato); 
        System.out.println("Fecha y hora actual: " + fechaHoraActualFormateada);
        
        System.out.println("\nBienvenido a la clase 3 de Java - JAR FILES\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cual es tu nombre?");
        String nombre = sc.next();
        
        System.out.println("¿Como estas? "
        		+ "1. Enojado \n"
        		+ "2. Triste \n"
        		+ "3. Feliz \n"
        		+ "4. Preocupado \n"
        		+ "5. Aburrido \n"
        		+ "6. Somnoliento \n");
        int estadoDeanimo = sc.nextInt();
        
        IPersona persona = new Persona(nombre, estadoDeanimo);
        
        persona.comoEstas(estadoDeanimo);
        sc.close();

	}

}
