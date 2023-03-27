package es.pildoras.aop.aspectos;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
@Aspect
@Component

public class Aspecto {
	@Before("execution(public void cierraPrograma())")
	public void estaPorSaludar()
	{
		System.out.println("Se esta generando un fichero");
	}
	
}