/**
 * @author andres Say Agosto 19705
 *@author Luis pedro Garcia 19
 * @param <E>
 */
public interface iStack<E>{
	
	public boolean empty();
	public E peek();
	public E pop();
	public E push(E elemento);
	public int search(E elemento);
	
	
	
}