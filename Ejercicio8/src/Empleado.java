import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Empleado extends Persona implements IEmpleado{
	
	private LocalDate fechaIngreso;
	private int salario;
	private String posicion;
	private long antiguedadLaboral;
	
	
	

	public Empleado(String nombre, String apellidos, String dNI, String localidadDeNacimiento,
			LocalDate fechaDeNacimeinto, LocalDate fechaIngreso, int salario, String posicion) {
		super(nombre, apellidos, dNI, localidadDeNacimiento, fechaDeNacimeinto);
		this.fechaIngreso = fechaIngreso;
		this.salario = salario;
		this.posicion = posicion;
		LocalDate fechaActual = LocalDate.now();
		this.antiguedadLaboral = calcularAntiguedadLaboral(fechaIngreso, fechaActual);;
	}
	
	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDate fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}

	public long getAntiguedadLaboral() {
		return antiguedadLaboral;
	}

	public void setAntiguedadLaboral(int antiguedadLaboral) {
		this.antiguedadLaboral = antiguedadLaboral;
	}

	@Override
	public long calcularAntiguedadLaboral(LocalDate fechaIngreso, LocalDate fechaActual) {
		
		long dias = ChronoUnit.DAYS.between(fechaIngreso, fechaActual);

		
		return dias;
	}


	
	
}
