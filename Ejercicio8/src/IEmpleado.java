import java.time.LocalDate;

public interface IEmpleado {
	long calcularAntiguedadLaboral(LocalDate fechaIngreso, LocalDate fechaActual);
	
}
