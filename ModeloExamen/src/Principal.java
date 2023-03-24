import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		
		IPersona[] empleados = {
                new Empleado("Luis Angel", "Redondo", "Leon", "Informatico", 10000),
                new Empleado("María", "García", "Barcelona", "Administrativo", 2000),
                new Empleado("Pedro", "López", "Valencia", "Programador", 3000)
        };
		
		
		LocalDate fecha = LocalDate.now();
		
		try {
			String ruta =  "C:\\Users\\luis-\\Desktop\\PruebaClaseJava\\info_empleados_Prueba"+fecha+".txt";
			File file = new File(ruta);
			FileWriter fw = new FileWriter(file);
			
			BufferedWriter bw = new BufferedWriter(fw);
			
			for(int i = 0; i<empleados.length;i++) {
				Empleado e = (Empleado) empleados[i];
				bw.write("Nombre: "+e.getNombre());
				bw.write(" Apellido: "+e.getApellido());
				bw.write(" Localidad: "+e.getLocalidad());
				bw.write(" Posicion: "+e.getPosicion());
				bw.write(" Sueldo: "+e.getSueldo());
				bw.write("\n");
			}
			bw.close();
			
		}catch (IOException e) {
			
			e.printStackTrace();
		}
		
		
		

	}
	
	

}
