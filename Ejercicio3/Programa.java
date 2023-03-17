import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

interface IPersona {
    String getNombre();
    String getApellido();
    String getLocalidad();
}

class Persona implements IPersona {
    private String nombre;
    private String apellido;
    private String localidad;

    public Persona(String nombre, String apellido, String localidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.localidad = localidad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getLocalidad() {
        return this.localidad;
    }
}
interface IEmpleado {
    String getPosicion();
    double getSueldo();
}

class Empleado extends Persona implements IEmpleado{
    private String posicion;
    private double sueldo;

    public Empleado(String nombre, String apellido, String localidad, String posicion, double sueldo) {
        super(nombre, apellido, localidad);
        this.posicion = posicion;
        this.sueldo = sueldo;
    }

    public String getPosicion() {
        return this.posicion;
    }

    public double getSueldo() {
        return this.sueldo;
    }
}

public class Programa {
    public static void main(String[] args) {
        IPersona[] personas = {
            new Empleado("Luis Angel", "Redondo", "Leon", "Informatico", 10000),
            new Empleado("María", "González", "Barcelona", "Analista", 3000),
            new Empleado("Pedro", "Gómez", "Valencia", "Programador", 2000)
        };
        System.out.println();
        try {
        	LocalDate fecha = LocalDate.now();
        	String ruta =  "C:\\Users\\luis-\\Desktop\\PruebaClaseJava\\info_empleados_"+fecha+".txt";
			File file = new File(ruta);
			FileWriter fw = new FileWriter(file);
			
			BufferedWriter bw = new BufferedWriter(fw);
			
            for (IPersona persona : personas) {
                
                    Empleado empleado = (Empleado) persona;
                    String linea = "Nombre: "+ empleado.getNombre()+"\nApellido: "+empleado.getApellido()+"\nLocalidad: "+empleado.getLocalidad()+" \nPosicion  "+empleado.getPosicion()+"\nSueldo: "+empleado.getSueldo()+"\n";
                    bw.write(linea);
                    bw.write("\n");
                
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

