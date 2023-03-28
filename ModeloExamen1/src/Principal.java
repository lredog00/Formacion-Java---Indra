import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;

import java.time.LocalDate;
import java.util.ArrayList;




public class Principal {

	public static void main(String[] args) {
		
		System.out.println("BIENVENIDO A MI PROGRAMA\n");
		
		//Leer archivos para guardar información de usuarios
		
		
		try {
			File doc = new File("C:\\Users\\luis-\\Desktop\\ModeloExamen1\\Plantilla.txt");
		    BufferedReader obj = new BufferedReader(new FileReader(doc));
		    //Set<Usuario> personas = new HashSet<Usuario>(); // Crear lista Set de personas para que no haya duplicados --> No funciona. Creo de tipo ArrayList y lo convierto en Set
		    
		    int numLineas = 10; // Definir el número de líneas a leer
		    ArrayList<Producto> listaP = new ArrayList<>();
		    Tienda t = new Tienda();
		    
		    for (int i = 0; i < numLineas; i++) {
		        String linea = obj.readLine();
		        if (linea == null) {
		            break; // Si se alcanza el final del archivo, salir del bucle
		        }
		        if(i==0) {
		        	
		        }else {
			        String[] partes = linea.split("/"); // Separar los campos de la línea usando la coma como separador
			        
			        String descripcion = partes[0];
			        
			       
			        if (descripcion.equals("Remera")){
			        	double precioUnitario = Double.parseDouble(partes[1]);
			        	int cantidadVendidaTotal = Integer.parseInt(partes[2]);
			        	LocalDate fechaUltimaCompra = LocalDate.of(Integer.parseInt(partes[3]), Integer.parseInt(partes[4]), Integer.parseInt(partes[5]));
			        	Producto p = new Remera(descripcion, precioUnitario, cantidadVendidaTotal, fechaUltimaCompra, "Argentina");
			        	
			        	t.agregarProducto(p);
			        	
			        	
			        }
			        if (descripcion.equals("Camisa")){
			        	double precioUnitario = Double.parseDouble(partes[1]);
			        	int cantidadVendidaTotal = Integer.parseInt(partes[2]);
			        	LocalDate fechaUltimaCompra = LocalDate.of(Integer.parseInt(partes[3]), Integer.parseInt(partes[4]), Integer.parseInt(partes[5]));
			        	Producto p = new Camisa(descripcion, precioUnitario, cantidadVendidaTotal, fechaUltimaCompra, "Algodon");
			        	t.agregarProducto(p);
			        }
			        if (descripcion.equals("Vestido")){
			        	double precioUnitario = Double.parseDouble(partes[1]);
			        	int cantidadVendidaTotal = Integer.parseInt(partes[2]);
			        	LocalDate fechaUltimaCompra = LocalDate.of(Integer.parseInt(partes[3]), Integer.parseInt(partes[4]), Integer.parseInt(partes[5]));
			        	Producto p = new Vestido(descripcion, precioUnitario, cantidadVendidaTotal, fechaUltimaCompra, 1);
			        	t.agregarProducto(p);
			        }
			        if (descripcion.equals("Pantalon")){
			        	double precioUnitario = Double.parseDouble(partes[1]);
			        	int cantidadVendidaTotal = Integer.parseInt(partes[2]);
			        	LocalDate fechaUltimaCompra = LocalDate.of(Integer.parseInt(partes[3]), Integer.parseInt(partes[4]), Integer.parseInt(partes[5]));
			        	Producto p = new Pantalon(descripcion, precioUnitario, cantidadVendidaTotal, fechaUltimaCompra, 1);
			        	t.agregarProducto(p);
			        }
			        if (descripcion.equals("Sweater")){
			        	
			        	double precioUnitario = Double.parseDouble(partes[1]);
			        	int cantidadVendidaTotal = Integer.parseInt(partes[2]);
			        	LocalDate fechaUltimaCompra = LocalDate.of(Integer.parseInt(partes[3]), Integer.parseInt(partes[4]), Integer.parseInt(partes[5]));
			        	Producto p = new Sweater(descripcion, precioUnitario, cantidadVendidaTotal, fechaUltimaCompra, 1);
			        	t.agregarProducto(p);
			        	
			        }
			        
			        
			        t.generarTXT();
			        
			        
		        }
		    }
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
