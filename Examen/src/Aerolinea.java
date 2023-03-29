import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Aerolinea implements IVuelo{
	private String nombreAerolinea;

	public Aerolinea(String nombreAerolinea) {
		super();
		this.nombreAerolinea = nombreAerolinea;
	}

	public String getnombreAerolinea() {
		return nombreAerolinea;
	}

	public void setnombreAerolinea(String nombreAerolinea) {
		this.nombreAerolinea = nombreAerolinea;
	}
	

	@Override
	public int calcularValorFinalPorVuelo(Vuelo v) {
		int valorFinalPorVuelo = v.getValorUnitario() * v.getCantPasajeros();
		return valorFinalPorVuelo;
	}


	@Override
	public long calcularDiasDeDiferencia(Vuelo v) {
		LocalDate fechaActual = LocalDate.now();
		long dias = ChronoUnit.DAYS.between(v.getFechaVuelo(), fechaActual);
							
		return dias;
		
	}


	@Override
	public String calcularSegmentacion(Vuelo v) {
		int valorFinalPorVuelo = calcularValorFinalPorVuelo(v);
		String salida="No Rentable";
		if (v.getTipoPasaje().equals("ECONOMICO") && valorFinalPorVuelo>100) {
			salida = "Rentable";
		}
		if (v.getTipoPasaje().equals("ECONOMICO") && valorFinalPorVuelo<100) {
			salida = "No Rentable";
		}
		if (v.getTipoPasaje().equals("PREMIER") && valorFinalPorVuelo>1500) {
			salida = "Rentable";
		}if (v.getTipoPasaje().equals("PREMIER") && valorFinalPorVuelo<1500) {
			salida = "No Rentable";
		}
				
		
		return salida;
	}
	
	
}
