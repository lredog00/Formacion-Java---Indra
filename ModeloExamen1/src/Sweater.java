import java.time.LocalDate;

public class Sweater extends Producto{
	
	private int conCapucha;

	public Sweater(String descripcion, double precioUnitario, int cantidadVendidaTotal, LocalDate fechaUltimaCompra,
			int conCapucha) {
		super(descripcion, precioUnitario, cantidadVendidaTotal, fechaUltimaCompra);
		this.conCapucha = conCapucha;
	}

	public int getConCapucha() {
		return conCapucha;
	}

	public void setConCapucha(int conCapucha) {
		this.conCapucha = conCapucha;
	}
	
	
	
	
}
