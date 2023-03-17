
public class Persona implements IPersona{
	private String nombre;
	private String apellido;
	private String localidad;
	
	
	public Persona(String nombre, String apellido, String localidad) {
		
		this.nombre= nombre;
		this.apellido=apellido;
		this.localidad=localidad;
		
		
	}

	@Override
	public String getNombre() {
		
		return nombre;
	}

	@Override
	public String getApellido() {
		// TODO Auto-generated method stub
		return apellido;
	}

	@Override
	public String getLocalidad() {
		// TODO Auto-generated method stub
		return localidad;
	}

	
	
	
	
}
