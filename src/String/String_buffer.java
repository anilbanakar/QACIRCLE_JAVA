package String;

public class String_buffer {

	public static void main(String[] args) {
		
		StringBuffer str = new StringBuffer("welcome");
		
	   str.append("java");
	   System.out.println(str); // this will append with both the string
	   
	   str.insert(0, "x");
	   System.out.println(str);  
	  // System.out.println(str.reverse());
	   
	
	   //SubString 
	   
	   System.out.println( str.subSequence(1, 3));

	  System.out.println( str.reverse());
	   StringBuilder st = new StringBuilder();
	   // methods are same for both StringBuffer & StringBuilder
	   
	   StringBuffer sb = new StringBuffer("aa");
	   
	   String a1= "jj";
	   
	   
	   
	}

}
