import java.time.LocalDate;

public class Pantalon extends Producto{
	
	private int vaquero;

	public Pantalon(String descripcion, double precioUnitario, int cantidadVendidaTotal, LocalDate fechaUltimaCompra,
			int vaquero) {
		super(descripcion, precioUnitario, cantidadVendidaTotal, fechaUltimaCompra);
		this.vaquero = vaquero;
	}

	public int getVaquero() {
		return vaquero;
	}

	public void setVaquero(int vaquero) {
		this.vaquero = vaquero;
	}
	
	

}
