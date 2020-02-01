/**
 * Luis Pedro Garcia 19344
 * Andres Say Agosto 19705
 * Calculadora
 */
import java.util.Scanner;

public class CalculadoraMain {
	public static void main(String args[]){
		Scanner teclado1 = new Scanner(System.in);		//Scanner para ingresos de String 
		Scanner teclado2 = new Scanner(System.in);
		
		System.out.println("+-----------------------+");
		System.out.println("|      BIENVENIDO       |");
		System.out.println("+-----------------------+");
		
		boolean seguir = true;
		
		while (seguir) {
			System.out.println("Ingrese una opcion");
			System.out.println("1. calcular \n2. Salir");
			int opcion = teclado2.nextInt();
			if (opcion == 1) {
				System.out.println("--------------------INGRESAR-----------------");
				String valor = teclado1.nextLine();
				
			}
			if (opcion == 2){
				seguir = false;
			}
		}
	}
	
	

}
