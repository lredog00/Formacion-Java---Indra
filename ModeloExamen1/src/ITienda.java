import java.util.ArrayList;

public interface ITienda {
	public void agregarProducto(Producto p);
	public void eliminarProducto(Producto p);
	public void actualizarProducto(Producto oldP, Producto updateP);
	
	public double calcularPrecioFinal(Producto p); //precio unitario *cantidad vendida *21
	
	public double promedioDeVentas();
	
	public double precioFinalUnidad(Producto p);
	
	public int cantidadDeVentas();
	
	public long calcularDias(Producto p);
	
	public void generarTXT();
	//public ArrayList<Producto> getStockTienda();
	
	
}
