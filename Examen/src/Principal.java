import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;


public class Principal {
	public static void main(String[] args) {

		
		//Leer archivos para guardar información de usuarios
		
	
		try {
			
			Aerolinea a = new Aerolinea("Iberia");
			File doc = new File("C:\\Users\\luis-\\Desktop\\Examen\\VuelosTXT.txt");
		    BufferedReader obj = new BufferedReader(new FileReader(doc));
		    //Set<Usuario> personas = new HashSet<Usuario>(); // Crear lista Set de personas para que no haya duplicados --> No funciona. Creo de tipo ArrayList y lo convierto en Set
		    
		    int numLineas = 12; // Definir el número de líneas a leer
		   
		    LocalDate fechaActual = LocalDate.now();
			
			
			String ruta = "C:\\Users\\luis-\\Desktop\\Examen\\info_vuelos_"+fechaActual+".txt";
			File file = new File(ruta);
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("BIENVENIDO AL SISTEMA DE AEROLINEAS "+a.getnombreAerolinea()+"\n\n");
			bw.write("NOMBRE_VUELO\tCANT_PASAJEROS\tTIPO_PASAJE\tVALOR_UNITARIO\tFECHA_VUELO\tVALOR_FINAL_POR_VUELO\tDIAS_DE_DIFERENCIA\tSEGMENTACION\n");
            
			int montoFinal = 0;
		    for (int i = 0; i < numLineas; i++) {
		        String linea = obj.readLine();
		        if (linea == null) {
		            break; // Si se alcanza el final del archivo, salir del bucle
		        }
		        if(i==0) {
		        	//LA primera Linea la ignoramos
		        }else {
			        String[] partes = linea.split("/"); // Separar los campos de la línea usando la coma como separador
			        
			        String nombreVuelo = partes[0];
			        int cantPasajeros = Integer.parseInt(partes[1]);
			        String tipoPasaje = partes[2];
			        int valorUnitario = Integer.parseInt(partes[3]);
			        LocalDate fechaDeVuelo = LocalDate.of(Integer.parseInt(partes[4]), Integer.parseInt(partes[5]), Integer.parseInt(partes[6]));
			        
			        
			        Vuelo v = new Vuelo(a.getnombreAerolinea(), nombreVuelo, cantPasajeros, tipoPasaje, valorUnitario, fechaDeVuelo);
			        
					montoFinal = montoFinal + a.calcularValorFinalPorVuelo(v);
					
		            bw.write(v.getNombreVuelo() + "\t" + v.getCantPasajeros() + "\t\t\t" + v.getTipoPasaje() + "\t" + v.getValorUnitario() + "\t\t\t" + v.getFechaVuelo() + "\t" + a.calcularValorFinalPorVuelo(v) + "\t\t\t\t" + a.calcularDiasDeDiferencia(v) + "\t\t\t\t" + a.calcularSegmentacion(v) + "\n");
		          
		        }
		    }
		    
		    bw.write("\n");
		    bw.write("El MONTO FINAL es "+montoFinal+"\n");
		    obj.close();
		    bw.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
