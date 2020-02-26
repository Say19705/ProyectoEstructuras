/**
 * @author andres Say 19705
 *@author Luis Pedro Garcia 19
 *Clase calculadora implementa su interfaz
 */
public class Calculadora implements iCalculadora {

	
	public int sumar(int operando1, int operando2) {
		int result = operando1 + operando2;
		return result;
	}

	
	public int restar(int operando1, int operando2) {
		int result = operando1 - operando2;
		return result;
	}

	
	public int dividir(int operando1, int operando2) {
		int result = (operando1/operando2);
		return result;
	}

	
	public int multiplicar(int operando1, int operando2) {
		int result = operando1*operando2;
		return result;
	}

}
