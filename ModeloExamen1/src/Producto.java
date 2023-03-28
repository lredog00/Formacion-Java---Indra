import java.time.LocalDate;

public class Producto {
	private String descripcion;
	private double precioUnitario;
	private int cantidadVendidaTotal;
	private LocalDate fechaUltimaCompra;
	
	public Producto(String descripcion, double precioUnitario, int cantidadVendidaTotal, LocalDate fechaUltimaCompra) {
		super();
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
		this.cantidadVendidaTotal = cantidadVendidaTotal;
		this.fechaUltimaCompra = fechaUltimaCompra;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public int getCantidadVendidaTotal() {
		return cantidadVendidaTotal;
	}
	public void setCantidadVendidaTotal(int cantidadVendidaTotal) {
		this.cantidadVendidaTotal = cantidadVendidaTotal;
	}
	public LocalDate getFechaUltimaCompra() {
		return fechaUltimaCompra;
	}
	public void setFechaUltimaCompra(LocalDate fechaUltimaCompra) {
		this.fechaUltimaCompra = fechaUltimaCompra;
	}
	
	
	
	
	
}
