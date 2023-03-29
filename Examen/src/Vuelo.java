import java.time.LocalDate;


public class Vuelo extends Aerolinea{
	
	private String nombreVuelo;
	private int cantPasajeros;
	private String tipoPasaje;
	private int valorUnitario;
	private LocalDate fechaVuelo;
	
	

	
	public Vuelo(String nombreAerolinea, String nombreVuelo, int cantPasajeros, String tipoPasaje, int valorUnitario,
			LocalDate fechaVuelo) {
		super(nombreAerolinea);
		this.nombreVuelo = nombreVuelo;
		this.cantPasajeros = cantPasajeros;
		this.tipoPasaje = tipoPasaje;
		this.valorUnitario = valorUnitario;
		this.fechaVuelo = fechaVuelo;
	}

	public String getNombreVuelo() {
		return nombreVuelo;
	}

	public void setNombreVuelo(String nombreVuelo) {
		this.nombreVuelo = nombreVuelo;
	}

	public int getCantPasajeros() {
		return cantPasajeros;
	}

	public void setCantPasajeros(int cantPasajeros) {
		this.cantPasajeros = cantPasajeros;
	}

	public String getTipoPasaje() {
		return tipoPasaje;
	}

	public void setTipoPasaje(String tipoPasaje) {
		this.tipoPasaje = tipoPasaje;
	}

	public int getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(int valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public LocalDate getFechaVuelo() {
		return fechaVuelo;
	}

	public void setFechaVuelo(LocalDate fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}


	
}
