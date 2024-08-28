package String_builderDemo;

public class String_builder_demo {

	// METHODS ARE SAME IN String_BUILDER AND StringBUFFER
	 
	public static void main(String[] args) {
		
		StringBuilder builder =	new StringBuilder("welcome java");
	     //System.out.println(builder);
	    // System.out.println(builder.replace(0, 1, "j"));  //  if starting and ending index is same then it will added chracerr, so ending index should > start index
	     
	     //System.out.println(builder.delete(8, 11));
	       
	     //System.out.println(builder.substring(0));
	     
	     StringBuffer str = new StringBuffer("anil");
	     str.append(" kumar ");
	     
	     System.out.println(str);
	
	
	}

}
