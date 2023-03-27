package es.pildoras.aop;
import org.springframework.stereotype.Component;

@Component
public class CerrarPrograma 
{	
	public void cierraPrograma(){
		System.out.println("Se esta cerrando el programa");
	}
}