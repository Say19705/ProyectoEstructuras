import java.util.ArayList;

public class PilaVectores<E> implements iPila<E> {

	protected ArrayList<E> listaE;
	
	public pilaVectores(){
		listaE = new ArrayList<E>();
	}
	
	
	public boolean empty() {
		
		return size()==0;
	}

	
	public E peek() {
		
		return listaE.get(size()-1);
	}

	
	public E pop() {
		
		return listaE.get(size()-1);
	}

	
	public void push(E item) {
		
		lista.add(item);
	}

	
	public int size() {
		
		return listaE.size();
	}

}
