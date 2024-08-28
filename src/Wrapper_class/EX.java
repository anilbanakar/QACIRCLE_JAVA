package Wrapper_class;

public class EX {

	public static void main(String[] args) {
	 // Converting primiive to non primitive and vice versa 
		
		 // Types 1.Boxing and 2.unboxing
		//Boxing - Auto and manual boxing 
		
		//Auto 
		
		int a =10;
		Integer i = a;
		System.out.println(i); // Auto Boxing
		
		Integer x = new Integer(a); // manual boxing 
		System.out.println(x); 
		
	        //unboxing  
	      
	         Integer d=new Integer(12); // auto unboxing 
	          int e =d;
	          System.out.println(e);  
	          
	       //   Manual unboxing
	            
	          int g = d.intValue();
	          System.out.println(g);
	          
	          
	          
	          
	   
		
		
		
		
	}

}
