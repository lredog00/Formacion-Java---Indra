import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;



public class Principal {

	public static void main(String[] args) {
		
		System.out.println("BIENVENIDO A MI PROGRAMA\n");
		
		//Leer archivos para guardar información de usuarios
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/YY");
		try {
			File doc = new File("C:\\Users\\luis-\\Desktop\\EjercicioModeloExamen\\Usuarios_3.txt");
		    BufferedReader obj = new BufferedReader(new FileReader(doc));
		    //Set<Usuario> personas = new HashSet<Usuario>(); // Crear lista Set de personas para que no haya duplicados --> No funciona. Creo de tipo ArrayList y lo convierto en Set
		    List<Usuario> personas = new ArrayList<Usuario>();
		    int numLineas = 10; // Definir el número de líneas a leer
		    
		    for (int i = 0; i < numLineas; i++) {
		        String linea = obj.readLine();
		        if (linea == null) {
		            break; // Si se alcanza el final del archivo, salir del bucle
		        }
		        if(i==0) {
		        	
		        }else {
			        String[] partes = linea.split("/"); // Separar los campos de la línea usando la coma como separador
			        
			        String nombre = partes[0];
			        LocalDate fechaDeNacimiento = LocalDate.of(Integer.parseInt(partes[1]), Integer.parseInt(partes[2]), Integer.parseInt(partes[3]));
			        LocalDate fechaDeRegistro = LocalDate.of(Integer.parseInt(partes[4]), Integer.parseInt(partes[5]), Integer.parseInt(partes[6]));
			        LocalDate ultimaFechaDeLogin = LocalDate.of(Integer.parseInt(partes[7]), Integer.parseInt(partes[8]), Integer.parseInt(partes[9]));
			        int cantidadDeCompras = Integer.parseInt(partes[10]);
			        String pais = partes[11];
			        Persona persona = new Usuario(nombre, fechaDeNacimiento, pais, fechaDeRegistro, ultimaFechaDeLogin, cantidadDeCompras);
			       
			        // Agregar la persona a la lista
			        personas.add((Usuario) persona);
		        }
		    }
		    
		    
		    File doc2 = new File("C:\\Users\\luis-\\Desktop\\EjercicioModeloExamen\\USUARIOS_2.txt");
		    BufferedReader obj2 = new BufferedReader(new FileReader(doc2));
		   
		    
		    
		    for (int i = 0; i < numLineas; i++) {
		        String linea = obj2.readLine();
		        if (linea == null) {
		            break; // Si se alcanza el final del archivo, salir del bucle
		        }
		        if(i==0) {
		        	
		        }else {
			        String[] partes = linea.split("/"); // Separar los campos de la línea usando la coma como separador
			        
			        String nombre = partes[0];
			       
			        LocalDate fechaDeNacimiento = LocalDate.of(Integer.parseInt(partes[1]), Integer.parseInt(partes[2]), Integer.parseInt(partes[3]));
			       
			        LocalDate fechaDeRegistro = LocalDate.of(Integer.parseInt(partes[4]), Integer.parseInt(partes[5]), Integer.parseInt(partes[6]));
			        LocalDate ultimaFechaDeLogin = LocalDate.of(Integer.parseInt(partes[7]), Integer.parseInt(partes[8]), Integer.parseInt(partes[9]));
			        int cantidadDeCompras = Integer.parseInt(partes[10]);
			        String pais = partes[11];
			        Persona persona = new Usuario(nombre, fechaDeNacimiento, pais, fechaDeRegistro, ultimaFechaDeLogin, cantidadDeCompras);
			       
			        // Agregar la persona a la lista
			        personas.add((Usuario) persona);
		        }
		    }
		    
		    
		    File doc3 = new File("C:\\Users\\luis-\\Desktop\\EjercicioModeloExamen\\USUARIOS_1.txt");
		    BufferedReader obj3 = new BufferedReader(new FileReader(doc3));
		   
		    
		    
		    for (int i = 0; i < numLineas; i++) {
		        String linea = obj3.readLine();
		        if (linea == null) {
		            break; // Si se alcanza el final del archivo, salir del bucle
		        }
		        if(i==0) {
		        	
		        }else {
			        String[] partes = linea.split("/"); // Separar los campos de la línea usando la coma como separador
			        
			        String nombre = partes[0];
			        System.out.println(nombre);
			        LocalDate fechaDeNacimiento = LocalDate.of(Integer.parseInt(partes[1]), Integer.parseInt(partes[2]), Integer.parseInt(partes[3]));
			        LocalDate fechaDeRegistro = LocalDate.of(Integer.parseInt(partes[4]), Integer.parseInt(partes[5]), Integer.parseInt(partes[6]));
			        LocalDate ultimaFechaDeLogin = LocalDate.of(Integer.parseInt(partes[7]), Integer.parseInt(partes[8]), Integer.parseInt(partes[9]));
			        int cantidadDeCompras = Integer.parseInt(partes[10]);
			        String pais = partes[11];
			        Persona persona = new Usuario(nombre, fechaDeNacimiento, pais, fechaDeRegistro, ultimaFechaDeLogin, cantidadDeCompras);
			       
			        // Agregar la persona a la lista
			        
			        personas.add((Usuario) persona);
		        }
		    }
		    
		    
		    
		    	    
		    LocalDate fecha = LocalDate.now();
			
		    
		    Set<Usuario> setSinRepetidos = new HashSet<>(personas); //Creo el Set para eliminar repetidos (No me les borra)
		    
			try {
				String ruta =  "C:\\Users\\luis-\\Desktop\\EjercicioModeloExamen\\informeDiario_"+fecha+".txt";
				File file = new File(ruta);
				FileWriter fw = new FileWriter(file);
				
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write("Lista de Usuarios\n");
				 for (Iterator iterator = setSinRepetidos.iterator(); iterator.hasNext();) {
					Usuario u = (Usuario) iterator.next();
					
					bw.write("Nombre: "+u.getNombre());
					bw.write(" Fecha de Nacimiento: "+u.getFechaDeNacimiento().format(formatter));
					bw.write(" Edad: "+u.getEdad());
					bw.write(" Antiguedad: "+u.getAntiguedadEnDías());
					bw.write(" Segmento del usuario: "+u.getSegmentoDelUsuario());
					bw.write(" Status: "+u.getStatusUsuario());
					bw.write("\n");
				}
				bw.close();
				
			}catch (IOException e) {
				
				e.printStackTrace();
			}
			
		   
		   
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		

	}

}
