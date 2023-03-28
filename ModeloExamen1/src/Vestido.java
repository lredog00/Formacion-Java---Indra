import java.time.LocalDate;

public class Vestido extends Producto{
	private int elegante;

	public Vestido(String descripcion, double precioUnitario, int cantidadVendidaTotal, LocalDate fechaUltimaCompra,
			int elegante) {
		super(descripcion, precioUnitario, cantidadVendidaTotal, fechaUltimaCompra);
		this.elegante = elegante;
	}

	public int getElegante() {
		return elegante;
	}

	public void setElegante(int elegante) {
		this.elegante = elegante;
	}
	
	

}
