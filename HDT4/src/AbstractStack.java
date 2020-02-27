import java.util.*; 

public abstract class AbstractStack <E> implements iStack<E> {
	
	AbstractList<E> list = new LinkedList<E>(); 
	private boolean vacio;
	
	public boolean empty() {
		if(list.size()<= 0 ) {
			vacio = true;
		}
		else {
			vacio = false;
		}
		
		return vacio;
	}
	
	
	public E pop() {
		
		return list.remove(list.size()-1);
	}

	
	
	public int search(E elemento) {
		
	return list.indexOf(elemento);
		
		
	}
	
	public E  push (E elemento) {
		list.add(elemento);
		return elemento;
	}
	


	
	
	

}
