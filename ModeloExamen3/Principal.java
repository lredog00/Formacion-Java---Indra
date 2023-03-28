import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.List;



public class Principal {
	
	public static void main(String[] args) {
		
		
		try {
			LocalDate fecha = LocalDate.now();
        	String ruta =  "C:\\Users\\luis-\\Desktop\\ModeloExamen3\\info_peliculas_"+fecha+".txt";
			File outputFile = new File(ruta);
			FileWriter fw = new FileWriter(outputFile);
			
			BufferedWriter bw = new BufferedWriter(fw);
			
			
			
			File doc = new File("C:\\Users\\luis-\\Desktop\\ModeloExamen3\\Top10Peliculas.txt");
		    BufferedReader obj = new BufferedReader(new FileReader(doc));
		    //Set<Usuario> personas = new HashSet<Usuario>(); // Crear lista Set de personas para que no haya duplicados --> No funciona. Creo de tipo ArrayList y lo convierto en Set
		    
		    int numLineas = 10; // Definir el n�mero de l�neas a leer
		   
		    
		    Set<String> top3FilmsWithMayRecaudacion = new HashSet<>();
		    Map<String, Long> listaDePelisPoryear = new HashMap<>();
		    String yearConMasPlata = null;
		    Set<String> filmsOrdenadas = new HashSet<>();
		    for (int i = 0; i < numLineas; i++) {
		        String linea = obj.readLine();
		        if (linea == null) {
		            break; // Si se alcanza el final del archivo, salir del bucle
		        }
		        if(i==0) {
		        	
		        }else {
			        String[] partes = linea.split("/"); // Separar los campos de la l�nea usando la coma como separador
			        
			        int ranking = Integer.parseInt(partes[0]);
			        String nombre = partes[1];
			        long recaudacionTotal = Long.parseLong(partes[2]);
			        String year = partes[3];
			        
			        if(ranking<=3) {
			        	top3FilmsWithMayRecaudacion.add(nombre);
			        }
			        
			        listaDePelisPoryear.put(year, recaudacionTotal);
			        filmsOrdenadas.add(nombre);
		        }
		       
		    }
		    
		    //Top 3
		    bw.write("Top 3 Peliculas\n");
		    for (Iterator iterator = top3FilmsWithMayRecaudacion.iterator(); iterator.hasNext();) {
		    	   String film = (String) iterator.next();
		    	   System.out.println(film);
		    	   bw.write(film+"\n");
								
			}
		    bw.write("\n");
		    
		    //Recaudacion por a�o
		    bw.write("Recaudacion por a�o\n");
		    for (Map.Entry<String, Long> entry : listaDePelisPoryear.entrySet()) {
		    	String year = entry.getKey();
		    	long recaudacion = entry.getValue();
		    	System.out.println("A�o: "+year+" Recaudaci�n: "+recaudacion); 
		    	bw.write("A�o: "+year+" Recaudaci�n: "+recaudacion);
		    	bw.write("\n");
		    }
		    bw.write("\n");
		    //Year con mayor recaudaci�n
		    bw.write("A�o con mayor recaudaci�n\n");
		    Map.Entry<String, Long> primerElemento = listaDePelisPoryear.entrySet().iterator().next();
	        String clave = primerElemento.getKey();
	        long recaudacionMax = primerElemento.getValue();
	        yearConMasPlata=clave;
		    
		    for (Map.Entry<String, Long> entry : listaDePelisPoryear.entrySet()) {
		    	String year = entry.getKey();
		    	long recaudacion2 = entry.getValue();
		    	if(recaudacionMax<recaudacion2) {
		    		yearConMasPlata = year;
		    		recaudacionMax = recaudacion2;
		    	}
		    	System.out.println(recaudacionMax);
		    	 
		    }
		    
		    System.out.println("El a�o con m�s recaudaci�n fue el a�o "+yearConMasPlata+" con una recaudaci�n de $"+recaudacionMax);
		    bw.write("El a�o con m�s recaudaci�n fue el a�o "+yearConMasPlata+" con una recaudaci�n de $"+recaudacionMax);
		    bw.write("\n");
		    bw.write("\n");
		    //Lista ordenada de peliculas
		    bw.write("Lista ordenada alfab�ticamente de peliculas\n");
		    List<String> listaDePeliculas = new ArrayList<>(filmsOrdenadas);
		    
		    Collections.sort(listaDePeliculas);
		    
		    for (Iterator iterator = listaDePeliculas.iterator(); iterator.hasNext();) {
				String films = (String) iterator.next();
				System.out.println(films);
				bw.write(films);
				bw.write("\n");
				
			}
		    
		    bw.close();
		    
		    
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
