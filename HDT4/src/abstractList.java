import java.util.List;

public abstract class abstractList<E> implements List<E>{
	public abstractList() {
		
	}
	public boolean contains(E value) {
		return -1 != indexOf(value);
	}
	 public boolean isEmpty()
	   // post: returns true iff list has no elements
	   {
	      return size() == 0;
	   }
}
