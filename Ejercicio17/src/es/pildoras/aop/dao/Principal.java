package es.pildoras.aop.dao;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import es.pildoras.aop.CerrarPrograma;
import es.pildoras.aop.Configuracion;

public class Principal implements IGenerarTXT{
	public static void main (String [] args)
	{
		AnnotationConfigApplicationContext contexto = new AnnotationConfigApplicationContext(Configuracion.class);
		
		CerrarPrograma cierre = contexto.getBean(CerrarPrograma.class);		
		
		cierre.cierraPrograma();
		Principal m = new Principal();
		m.generaTXT();
		contexto.close();
	}

	@Override
	public void generaTXT() {
		try {
			LocalDate fechaActual = LocalDate.now();
			String ruta = "C:\\Users\\luis-\\Desktop\\Ejercicio17Informe\\info_empleados_"+fechaActual+".txt";
			
			File file = new File(ruta);
			Empleado emp1 = new Empleado("Luis", "Redondo", 24);
			Empleado emp2 = new Empleado("Ruben", "Gutierrez", 30);
			
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			String contenido="";
			contenido = emp1.toString()+"\n"+emp2.toString();
			

			bw.write(contenido);
			bw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}