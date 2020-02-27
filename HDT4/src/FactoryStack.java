
public class FactoryStack {
	
	public AbstractStack decicionStack (String opcionStack ) {
		
		AbstractStack nuevoStack = null;
		
		if(opcionStack.equals("1")) {
			
			return new StackVector();
		} else
		
		if(opcionStack.equals("2")) {
			
			return new StackArrayList();
			
		} else return null;
		
		
		
		
	}
	
	
	
	
}
