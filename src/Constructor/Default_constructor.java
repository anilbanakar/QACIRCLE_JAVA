package Constructor;

public class Default_constructor {
	
	String name;  // THIS CAN calling without creating a constructor , means which will have default constructor
	  //Default_constructor () { // here constructor created 
	  //System.out.println("test"); 
		

	public static void main(String[] args) {
		
		System.out.println("Main started ");
		Default_constructor dt = new Default_constructor();
		System.out.println(dt.name);
	    System.out.println("main ended");
		

	}

}
