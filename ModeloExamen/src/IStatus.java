import java.time.LocalDate;

public interface IStatus {
	String calcularStatusUsuario(LocalDate ultimaFechaDeLogin);
}
