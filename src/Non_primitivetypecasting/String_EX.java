package Non_primitivetypecasting;

public class String_EX {

	public static void main(String[] args) {
	
		String s1= "java";
		String s2="python";
		
		System.out.println(s1.concat(s2));
		
		System.out.println(s1.charAt(0));
		
	  String s3="c++ java";
	  String[] s4 = s3.split("\\s");
	  
	  for(String w: s4)
	  {
	  
	  System.out.println(w);
	  }

	}

}
