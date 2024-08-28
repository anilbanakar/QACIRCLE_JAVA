package Methods;

public class method {

  //	this is example with method return type int
	/*static int add(int a, int b)
	{
		int result=a+b;
		return result; // always retrun with variable name add mehod is retruning something
		
	}


//if return type of method is any type like int / string, we need to return the statement at the end of the method-but this is not mandatory if you are result is returning in main method  
//if the return type is void we can use retrun statment as only return, if you return with any result then will through error
	
	   public static void main(String[] args) {
	
	    int result=	add(10,20);
		System.out.println(result);
	}
*/
	 static void add(int a, int b)
	{
		int result=a+b;
		System.out.println(result);
		return; 	
}
	public static void main(String[] args) {
	
	     add(10,10);
	    
	 
	}
	
	}
	
	
	
	
	