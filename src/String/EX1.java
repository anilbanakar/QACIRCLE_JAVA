package String;

public class EX1 {

	public static void main(String[] args) {
		
	//Below are some exmples, String won't allow duplicae and always referes to latest value creaed in object	
	/*
		String s= "anil";
		s="a";
		
		System.out.println(s);
	
	String s1= new String("JAVA");
	String s2= new String("JAVA"); // this will point to existing object in memory/heap 
	
	System.out.println(s1);
		
	}
	*/
	
	String s1="anil";
	String s2="anil";
	String s3 = new String("anil"); // this will store in heap, s2 and s3 stoing in different places  
	
	System.out.println(s1==s2); //true 
	System.out.println(s1==s3); //false bsc both s1 and s2 data is sored in scp, 
	
	System.out.println(s2==s3); // false if we use new keyword data will sore in heap, so since both are different places data is storing it will not match
	
	
	String str = new String("Welcome to JavaTpoint.");   
	String str1 = new String("Welcome to JavaTpoint");  
	System.out.println(str1 == str); // prints false 
	
	}
}
