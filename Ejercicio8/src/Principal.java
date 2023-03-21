import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Principal {

	public static void main(String[] args) {
		Persona empleado1 = new Empleado("Luis", "Redondo", "71476853V", "Villafañe", LocalDate.of(1998, 05, 30), LocalDate.of(2023, 02, 27), 1300, "Informatico");
		Persona empleado2 = new Empleado("Ruben", "Redondo", "61476853V", "Madrid", LocalDate.of(1995, 05, 20), LocalDate.of(2023, 02, 27), 1300, "Informatico");
		Persona empleado3 = new Empleado("Pedro", "Gutierrez", "51476853V", "Palazuelo", LocalDate.of(1998, 06, 23), LocalDate.of(2023, 02, 27), 1300, "Analista");
		Persona empleado4 = empleado2;
		
		Set<Persona> empleados = new HashSet<>();
		
		empleados.add(empleado1);
		empleados.add(empleado2);
		empleados.add(empleado3);
		empleados.add(empleado4);
		
		System.out.println(empleados);
		
		LocalDate fechaActual = LocalDate.now();
		
		try {
			String ruta = "C:\\Users\\laredondo\\Desktop\\Ejercicio8\\info_salarial_plantilla_"+fechaActual+".txt";
			File file = new File(ruta);
			FileWriter fw = new FileWriter(file);
			
			BufferedWriter bw = new BufferedWriter(fw);
			for (Iterator iterator = empleados.iterator(); iterator.hasNext();) {
				Empleado e = (Empleado) iterator.next();
				bw.write("Nombre: "+e.getNombre());
				bw.write("\nApellido: "+e.getApellidos());
				bw.write("\nDNI: "+e.getDNI());
				bw.write("\nLocalidad: "+e.getLocalidadDeNacimiento());
				bw.write("\nFecha de Nacimiento: : "+e.getFechaDeNacimeinto());
				bw.write("\nFecha de ingreso: "+e.getFechaIngreso());
				bw.write("\nEdad: "+e.getEdad());
				bw.write("\nSalario: "+e.getSalario());
				bw.write("\nPosicion: "+e.getPosicion());
				bw.write("\nAntiguedad en Dias: "+e.getAntiguedadLaboral());
				bw.write("\n\n");
				
			}
			
			bw.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
