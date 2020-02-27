/**
 * @author andres Say 19705

 * @author Luis pedro Garcia 19344
 */

import java.util.ArrayList;


public class StackArrayList<E>  extends AbstractStack  {

	protected ArrayList<E> stack;
	private boolean vacio;
	
	public StackArrayList() {
		stack = new ArrayList<E>();
	}
	
	
	public boolean empty() {
		if(stack.size()<= 0 ) {
			vacio = true;
		}
		else {
			vacio = false;
		}
		
		return vacio;
	}

	

	
	public E pop() {
		
		return stack.remove(stack.size()-1);
	}

	
	public int search(E elemento) {
		
	return stack.indexOf(elemento);
		
		
	}


	
	public E  push (E elemento) {
		stack.add(elemento);
		return elemento;
	}


	@Override
	public E peek() {
		
		return null;
	}


}
