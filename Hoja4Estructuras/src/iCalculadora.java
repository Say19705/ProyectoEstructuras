/**
 * @author andres Say 19705
 * @author Luis pedro Garcia 19
 *Interfaz de la calculadora
 */
public interface iCalculadora{
	
	/**
	 * @param operando1
	 * @param operando2
	 * @return numero entero producto de la suma
	 */
	public int sumar(int operando1, int operando2); 
	
	/**
	 * @param operando1
	 * @param operando2
	 * @return numero entero producto de la resta
	 */
	
	public int restar(int operando1, int operando2);
	
	/**
	 * @param operando1
	 * @param operando2
	 * @return numero entero producto de la division
	 */
	public int dividir(int operando1, int operando2); 
	
	
	/**
	 * @param operando1
	 * @param operando2
	 * @return numero entero producto de la multiplicacion
	 */
	public int multiplicar(int operando1, int operando2);
	
	
		}