package primero;

import java.util.Scanner;

public class Calculadora implements OperacionesInterfaz{
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora c = new Calculadora();
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el primer numero");
		int num1 = teclado.nextInt();

		System.out.println("Introduce el segundo numero");
		int num2 = teclado.nextInt();
		
		
		c.menu();
		
		int opcion;
		System.out.println("Intruce una opcion del menu ");
		opcion = teclado.nextInt();
		
		
		switch (opcion) {
			case 1: 
				c.suma(num1, num2);
				break;
			
			case 2: 				
				c.resta(num1, num2);
				break; 
			
			case 3:
				c.division(num1, num2);
				break;
			case 4:
				c.multiplicacion(num1, num2);
				break;
			default:
				System.out.println("OPCION INCORRECTA");
				break;
		}
		teclado.close();
	}
	
	@Override
	public void menu() {
		System.out.println("Menu: ");
		System.out.println("1 - Suma");
		System.out.println("2 - Resta");
		System.out.println("3 - División");
		System.out.println("4 - Multiplicacion");		
	}
	
	@Override
	public void suma(int n1, int n2) {
		int suma = 0;
		suma = n1 +n2;
		System.out.println("la suma es: ");
		System.out.println(suma);
		
	}

	@Override
	public void resta(int n1, int n2) {
		int resta = 0;
		resta = n1 -n2;
		System.out.println("La resta es");
		System.out.println(resta);
	}

	@Override
	public void division(int n1, int n2) {
		int div=0;
		if (n2 == 0) {
			Scanner teclado = new Scanner(System.in);
			System.out.println("introduce un numero diferente de 0");
			n2 = teclado.nextInt();
			int j=0;
			while(n2==0) {
				System.out.println("introduce un numero diferente de 0");
				n2 = teclado.nextInt();
				
				j++;
			}
			teclado.close();
		}
		div= n1/n2;
		System.out.println("La divison es");
		System.out.println(div);
		
	}

	@Override
	public void multiplicacion(int n1, int n2) {
		int mult =0;
		mult=n1*n2;
		System.out.println("La multiplicación es ");
		System.out.println(mult);
		
	}

}
