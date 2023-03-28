import java.time.LocalDate;

public class Camisa extends Producto{
	private String tela;

	public Camisa(String descripcion, double precioUnitario, int cantidadVendidaTotal, LocalDate fechaUltimaCompra,
			String tela) {
		super(descripcion, precioUnitario, cantidadVendidaTotal, fechaUltimaCompra);
		this.tela = tela;
	}

	public String getTela() {
		return tela;
	}

	public void setTela(String tela) {
		this.tela = tela;
	}
	

}
