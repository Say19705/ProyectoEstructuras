/**
 * Luis Pedro Garcia 19344
 * Andres Say Agosto 19705
 * Calculadora
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class CalculadoraMain {
	public static void main(String args[]) throws FileNotFoundException{
		Scanner teclado1 = new Scanner(System.in);		//Scanner para ingresos de String 
		Scanner teclado2 = new Scanner(System.in);
		iCalculadora calcu = new Calculadora();
		iStack <Integer> stack = new StackVector<Integer>();
		
		File txt = new File("datos.txt");
		
		
		
		System.out.println("+-----------------------+");
		System.out.println("|      BIENVENIDO       |");
		System.out.println("+-----------------------+");
		
		boolean seguir = true;
		while (seguir) { //inicio del ciclo principal
			System.out.println("Ingrese una opcion");
			System.out.println("1. calcular \n2. Salir");
			int opcion = teclado2.nextInt();
			if (opcion == 1) {
				if(txt.exists()) {
					Scanner data = new Scanner(txt);
					String datos = data.nextLine();
					System.out.println("Su operacion es la siguiente");
					System.out.println(datos);
					String[] values = datos.split(" ");
					for(int i=0; i<values.length;i++){
						try{
							int a = Integer.parseInt(values[i]);
							stack.push(a);
						}catch(NumberFormatException e){
							
							String b = values[i];
							int operando1 = stack.pop(), operando2 = stack.pop();
							boolean op = true;
							while(op) { // si encuentra un operando
								if(b.equals("+")) {
									stack.push(calcu.sumar(operando1,operando2));
									op = false;
								}
								else if(b.equals("-")) {
									stack.push(calcu.restar(operando1,operando2));
									op = false;
								}
								else if(b.equals("*")) {
									stack.push(calcu.multiplicar(operando1,operando2));
									op = false;
								}
								else if (b.equals("/")) {
									stack.push(calcu.dividir(operando1,operando2));
									op = false;
								}
							}
						}
					}

				}else{
					System.out.println("No se encontraron los datos");
				}
				System.out.println("Respuesto: "+stack.peek());
				}
			if (opcion == 2){
				seguir = false;
			}

	
		}
	}
}

