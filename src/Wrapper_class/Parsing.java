package Wrapper_class;

public class Parsing {

	public static void main(String[] args) {
		
		String s1="10";
		String s2="20";
	
		System.out.println(s1+s2);  // o/p 1020 
		
	// so here convered string to int 
		
		Integer i  = Integer.parseInt(s1);
		Integer j = Integer.parseInt(s2);
		System.out.println(i+j); // o/p 30;
	}

}
