/**
 * @author andres Say Agosto 19705
 *@author Luis pedro Garcia 19
 * @param <E>
 */
public interface iStack<E>{
	
	/**
	 * @return Revisa si el stack esta vacio
	 */
	public boolean empty();
	
	public E peek();
	
	/**
	 * @param elemento
	 * @return el elemento mas reciente en el stack
	 */
	public E pop();
	
	
	/**
	 * @param elemento
	 * @return
	 */
	public E push(E elemento);
	
	public int search(E elemento);
	
	
	
}