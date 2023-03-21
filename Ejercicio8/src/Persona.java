import java.time.LocalDate;
import java.time.Period;

public class Persona implements IPersona{
	private String nombre;
	private String apellidos;
	private String DNI;
	private String localidadDeNacimiento;
	private LocalDate fechaDeNacimeinto;
	private int edad;
	
	
	public Persona(String nombre, String apellidos, String dNI, String localidadDeNacimiento,
			LocalDate fechaDeNacimeinto) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.DNI = dNI;
		this.localidadDeNacimiento = localidadDeNacimiento;
		this.fechaDeNacimeinto = fechaDeNacimeinto;
		
		this.setEdad(calcularEdad(fechaDeNacimeinto));
		
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getLocalidadDeNacimiento() {
		return localidadDeNacimiento;
	}

	public void setLocalidadDeNacimiento(String localidadDeNacimiento) {
		this.localidadDeNacimiento = localidadDeNacimiento;
	}

	public LocalDate getFechaDeNacimeinto() {
		return fechaDeNacimeinto;
	}

	public void setFechaDeNacimeinto(LocalDate fechaDeNacimeinto) {
		this.fechaDeNacimeinto = fechaDeNacimeinto;
	}

	@Override
	public int calcularEdad(LocalDate fechaDeNacimiento) {
		LocalDate fechaActual = LocalDate.now();
		
		Period periodo = Period.between(fechaDeNacimiento, fechaActual);
		int edad = periodo.getYears();
		return edad;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	

}
