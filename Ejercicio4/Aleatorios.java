import java.util.Scanner;

public class Aleatorios {

	public static void main(String[] args) {
		int numero = (int) (Math.random()*100+1);
		int num = 0;
		int i=0;
		Scanner sc = new Scanner(System.in);
		
		while(num != numero && i<3) {
			
			System.out.println("Introduce el numero ");
			num = sc.nextInt();
			
			i++;
		}
		if(num==numero) {
			System.out.println("Eres un crack");
		}else {
			System.out.println("Otra vez será");
		}
		sc.close();

	}

}
