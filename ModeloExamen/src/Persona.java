import java.time.LocalDate;
import java.time.Period;

public class Persona implements IEdad{
	private String nombre;
	private LocalDate fechaDeNacimiento;
	private int edad; //Calcular
	private String pa�s;
	
	public Persona(String nombre, LocalDate fechaDeNacimiento, String pa�s) {
		super();
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.edad = calcularEdad(fechaDeNacimiento);
		this.pa�s = pa�s;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPa�s() {
		return pa�s;
	}

	public void setPa�s(String pa�s) {
		this.pa�s = pa�s;
	}

	@Override
	public int calcularEdad(LocalDate fechaDeNacimiento) {
		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(fechaDeNacimiento, fechaActual);
		int edad = periodo.getYears();
		return edad;
	}
	
	
	
	
	
	
	
	
	
	
}
