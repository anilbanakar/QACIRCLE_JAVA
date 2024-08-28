package String;

public class String_methods {

	public static void main(String[] args) {	
		
		
		String s1="java";
		String s2="programming";
		
		 
         String x = s1.substring(0);
         	System.out.println(x);
         			
		
		// 1.Concat
		s1.concat(s2);
		
	
		System.out.println(s1); //java
		System.out.println(s2); //programming
		String s3= s1.concat(s2);
		
		
		System.out.println(s3); //  javaprogramming 
		//or use 14 and 16 line in one statement
		System.out.println(s1.concat(s2));// javaprogramming
		 
		// uppercase
		System.out.println(s1.toUpperCase());
		//lowercase
		System.out.println(s1.toLowerCase());
	
		// Trim : it will remove the space beginning index of string and ending index of string
		
		String s4 = " python " ;
		System.out.println(s4.trim());
		// Length
		System.out.println(s4.length());// 6 - space included on both side 
		
		//Split
		String s5= "c++ java"; 
		
		String words[] = s5.split("\\s");
		
		for(String w :words )
			{
				System.out.println(w); 	 // o/p- i will print in two lines
		   }
		
		//toString  // written in separate
		
		//endswith 
		
	    System.out.println(s5.endsWith("x")); // it will check wheher character available or not in string and result will be in boolean
		
		//indexof
		System.out.println(s5.indexOf("java")); // it will calculate before index count number o/p 4 
		
		//intren()
		String a1= new String("hello");
		String a2="hello";
		String a3=a1.intern();
		System.out.println(a1==a3); // o/p- false
		System.out.println(a2==a3); //o/p true
		
		String s6 = "java";
		System.out.println(s6.replace("a", "b")); 
		
		System.out.println(s6.replaceAll("a", "r"));
		//System.out.println(); 
		
		System.out.println(s6.contains("j")); 	 // true
		
		System.out.println(s6.substring(2)); // va
		System.out.println(s6.substring(0,3)); //o/p java // ending index will subsract with 1 always 
		
       System.out.println(s6.indexOf("java")); // 
		
		//tocharArray
	   System.out.println(s6.toCharArray()); // o/p -> java = this will change from string to characters
		
	}
}
