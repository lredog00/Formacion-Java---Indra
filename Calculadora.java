package primero;

import java.util.Scanner;

public class Calculadora {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce el primer numero");
		int num1 = teclado.nextInt();

		System.out.println("Introduce el segundo numero");
		int num2 = teclado.nextInt();
		
		System.out.println("Menu: ");
		System.out.println("1 - Suma");
		System.out.println("2 - Resta");
		System.out.println("3 - División");
		System.out.println("4 - Multiplicacion");
		
		int opcion;
		System.out.println("Intruce una opcion del menu ");
		opcion = teclado.nextInt();
		int i = 0;
		int suma = 0;
		int resta = 0;
		int mult = 0;
		int div = 0;
		
		switch (opcion) {
			case 1: 
				suma = num1 + num2;
				System.out.println("La suma es");
				System.out.println(suma);
				break;
			
			case 2: 
				
				resta = num1 - num2;
				System.out.println("La resta es");
				System.out.println(resta);
				break; 
			
			case 3:
				if (num2 == 0) {
					System.out.println("introduce un numero diferente de 0");
					num2 = teclado.nextInt();
					int j=0;
					while(num2==0) {
						num2 = teclado.nextInt();
						j++;
					}
				}
				div= num1/num2;
				System.out.println("La divison es");
				System.out.println(div);
				break;
			case 4:
				mult=num1*num2;
				System.out.println("La multiplicación es ");
				System.out.println(mult);
				break;
			default:
				System.out.println("OPCION INCORRECTA");
				break;
		}
		
	}

}
