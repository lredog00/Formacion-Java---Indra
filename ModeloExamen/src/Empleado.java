
public class Empleado extends Persona implements IEmpleado{
	
	private String posicion;
	private int sueldo;
	

	public Empleado(String nombre, String apellido, String localidad, String posicion, int sueldo) {
		super(nombre, apellido, localidad);
		this.posicion=posicion;
		this.sueldo=sueldo;
		
	}
	
	@Override
	public String getPosicion() {
		// TODO Auto-generated method stub
		return posicion;
	}

	@Override
	public int getSueldo() {
		// TODO Auto-generated method stub
		return sueldo;
	}
}
