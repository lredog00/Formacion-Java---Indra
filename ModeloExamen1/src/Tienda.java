import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Tienda implements ITienda{
	
	private ArrayList<Producto> stockTienda;
	
	
	public Tienda() {
		super();
		this.stockTienda = new ArrayList<>();
	}

	@Override
	public void agregarProducto(Producto p) {
		
		
		this.stockTienda.add(p);
		
		
	}

	@Override
	public void eliminarProducto(Producto p) {
		this.stockTienda.remove(p);
		
	}

	@Override
	public void actualizarProducto(Producto oldP, Producto updateP) {
		int index = this.stockTienda.indexOf(oldP);
		
		if (index != -1) {
			this.stockTienda.set(index, updateP);
		}
		
	}

	@Override
	public double calcularPrecioFinal(Producto p) {
		double precioFinal = p.getPrecioUnitario()*p.getCantidadVendidaTotal() * 1.21;
		return precioFinal;
	}

	@Override
	public double promedioDeVentas() {
		double sumaCantidadVentas = 0;
		double promedio=0;
		for(Producto p : this.stockTienda) {
			sumaCantidadVentas = sumaCantidadVentas + p.getCantidadVendidaTotal();
		}
		promedio=sumaCantidadVentas/this.stockTienda.size();
		
		return promedio;
	}
	
	@Override
	public double precioFinalUnidad(Producto p) {
		
		double precioFinalUnidad = p.getPrecioUnitario() * 1.21;
		return precioFinalUnidad;
		
	}
	
	@Override
	public int cantidadDeVentas() {
		int sumaCantidadVentas = 0;
		
		for(Producto p : this.stockTienda) {
			sumaCantidadVentas = sumaCantidadVentas + p.getCantidadVendidaTotal();
		}
		return sumaCantidadVentas;
	}

	@Override
	public long calcularDias(Producto p) {
		
		LocalDate fechaActual = LocalDate.now();
		long dias = ChronoUnit.DAYS.between(p.getFechaUltimaCompra(), fechaActual);
			
					
		return dias;
		
		
	}

	@Override
	public void generarTXT() {
		LocalDate fechaActual = LocalDate.now();
		
		try {
			String ruta = "C:\\Users\\luis-\\Desktop\\ModeloExamen1\\info_productos_"+fechaActual+".txt";
			File file = new File(ruta);
			FileWriter fw = new FileWriter(file);
			
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("DESCRIPCION\tPRECIO_UNITARIO\tCANTIDAD_VENDIDA_TOTAL\tFECHA_ULTIMA_COMPRA\tPRECIO_FINAL\tPROMEDIO_VENTAS\tPRECIO_FINAL_UNIDAD\tCANTIDAD_VENTAS\tDIAS_ULTIMA_VENTA\n");
            for (Producto p : this.stockTienda) {
                bw.write(p.getDescripcion() + "\t" + p.getPrecioUnitario() + "\t" + p.getCantidadVendidaTotal() + "\t" + p.getFechaUltimaCompra() + "\t" + this.calcularPrecioFinal(p) + "\t" + this.promedioDeVentas() + "\t" + this.precioFinalUnidad(p) + "\t" + this.cantidadDeVentas() + "\t" + this.calcularDias(p) + "\n");
            }
			
			bw.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public ArrayList<Producto> getStockTienda() {
		return stockTienda;
	}

	public void setStockTienda(ArrayList<Producto> stockTienda) {
		this.stockTienda = stockTienda;
	}

}
