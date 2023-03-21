
public class Persona implements IPersona{
	private String nombre;
	private int estadoDeAnimo;
	
	public Persona(String nombre, int estadoDeAnimo) {
		this.nombre = nombre;
		this.estadoDeAnimo = estadoDeAnimo;
	}
	
	
	public int getEstadoDeanimo() {
		return estadoDeAnimo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	
	
	
	
	@Override
	public void enojado() {
		System.out.println("HAZ YOGA");
		
	}

	@Override
	public void triste() {
		System.out.println("VETE A TERAPIA O VETE DE CAÑAS");
		
	}

	@Override
	public void feliz() {
		System.out.println("SIGUE ASI!!");
		
	}

	@Override
	public void preocupado() {
		System.out.println("Despreocupate");
		
		
	}

	@Override
	public void aburrido() {
		System.out.println("Tecuento un chistes");
		System.out.println(chistes());
		
	}

	@Override
	public void somnolienbto() {
		System.out.println("Tomate un café");
		
	}


	@Override
	public String chistes() {
		// TODO Auto-generated method stub
		String [] chistes = {"¿Cuál es el último animal que subió al arca de Noé? El del-fin.", "Un gato empieza a ladrar en el tejado de una casa. Otro gato, sorprendido, le dice: Estás loco gato, ¿por qué ladras en vez de maullar? El gatito le responde: ¿A caso no puedo aprender otro idioma?","¿Qué le dice un gusano a otro gusano? Voy a dar una vuelta a la manzana."};
		int aleatorio = (int) (Math.random()*2+1);
		return chistes[aleatorio];
	}


	@Override
	public void comoEstas(int estadoDeAnimo) {
		if(estadoDeAnimo == 1) {
			enojado();
		}
		if(estadoDeAnimo == 2) {
			triste();
		}
		if(estadoDeAnimo == 3) {
			feliz();
		}
		if(estadoDeAnimo == 4) {
			preocupado();
		}
		if(estadoDeAnimo == 5) {
			aburrido();
		}
		if(estadoDeAnimo == 6) {
			somnolienbto();
		}
		
	}
	
}
