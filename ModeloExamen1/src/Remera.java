import java.time.LocalDate;

public class Remera extends Producto{
	private String equipoDeFutbol;

	public Remera(String descripcion, double precioUnitario, int cantidadVendidaTotal, LocalDate fechaUltimaCompra,
			String equipoDeFutbol) {
		super(descripcion, precioUnitario, cantidadVendidaTotal, fechaUltimaCompra);
		this.equipoDeFutbol = equipoDeFutbol;
	}

	public String getEquipoDeFutbol() {
		return equipoDeFutbol;
	}

	public void setEquipoDeFutbol(String equipoDeFutbol) {
		this.equipoDeFutbol = equipoDeFutbol;
	}
	
	
}
