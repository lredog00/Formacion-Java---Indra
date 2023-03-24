import java.time.LocalDate;
import java.time.Period;

public class Usuario extends Persona implements IAntiguedad, ISegmentoUser, IStatus{
	
	private LocalDate fechaDeRegistro;
	private LocalDate ultimaFechaDeLogin;
	private int cantidadDeCompras;
	private long antiguedadEnYears;
	private String segmentoDelUsuario;
	private String statusUsuario;
	
	public Usuario(String nombre, LocalDate fechaDeNacimiento, String pa�s, LocalDate fechaDeRegistro,
			LocalDate ultimaFechaDeLogin, int cantidadDeCompras) {
		super(nombre, fechaDeNacimiento, pa�s);
		this.fechaDeRegistro = fechaDeRegistro;
		this.ultimaFechaDeLogin = ultimaFechaDeLogin;
		this.cantidadDeCompras = cantidadDeCompras;
		this.antiguedadEnYears = calcularAntiguedad(fechaDeRegistro);
		this.segmentoDelUsuario = calcularSegmentoDelUsuario(cantidadDeCompras);
		this.statusUsuario = calcularStatusUsuario(ultimaFechaDeLogin);
		
	}

	public LocalDate getFechaDeRegistro() {
		return fechaDeRegistro;
	}

	public void setFechaDeRegistro(LocalDate fechaDeRegistro) {
		this.fechaDeRegistro = fechaDeRegistro;
	}

	public LocalDate getUltimaFechaDeLogin() {
		return ultimaFechaDeLogin;
	}

	public void setUltimaFechaDeLogin(LocalDate ultimaFechaDeLogin) {
		this.ultimaFechaDeLogin = ultimaFechaDeLogin;
	}

	public int getCantidadDeCompras() {
		return cantidadDeCompras;
	}

	public void setCantidadDeCompras(int cantidadDeCompras) {
		this.cantidadDeCompras = cantidadDeCompras;
	}

	public long getAntiguedadEnD�as() {
		return antiguedadEnYears;
	}

	public void setAntiguedadEnD�as(long antiguedadEnD�as) {
		this.antiguedadEnYears = antiguedadEnD�as;
	}

	public String getSegmentoDelUsuario() {
		return segmentoDelUsuario;
	}

	public void setSegmentoDelUsuario(String segmentoDelUsuario) {
		this.segmentoDelUsuario = segmentoDelUsuario;
	}

	public String getStatusUsuario() {
		return statusUsuario;
	}

	public void setStatusUsuario(String statusUsuario) {
		this.statusUsuario = statusUsuario;
	}

	
	@Override
	public String calcularStatusUsuario(LocalDate ultimaFechaDeLogin) {
		// TODO Auto-generated method stub
		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(ultimaFechaDeLogin, fechaActual);
		int years = periodo.getYears();
		
		String status = null;
		if(years>2) {
			status = "Inactivo";
		}else {
			status = "Activo";
		}
		
		return status;
	}

	@Override
	public String calcularSegmentoDelUsuario(int cantidadDeCompras) {
		String segmento = null;
		if(cantidadDeCompras>=1 && cantidadDeCompras<=5) {
			segmento = "Estandar User";
		}
		if(cantidadDeCompras>=6 && cantidadDeCompras<=11) {
			segmento = "Affiliate";
		}
		if(cantidadDeCompras>11) {
			segmento = "Premier";
		}
		
		return segmento;
	}

	@Override
	public long calcularAntiguedad(LocalDate fechaDeRegistro) {
		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(fechaDeRegistro, fechaActual);
		long antiguedad = periodo.getYears();
		return antiguedad;
	}
	
	
	
}
