package Variables;

public class Static_variable {
	
	static int i=10;
	
	 int x=10;
	
	static void sum(int b, int c)
	{
		System.out.println(b+c);
		int x=20; // this will through compile time error 
	}

	public static void main(String[] args) {
		
		sum(10,20);  // static method can call direcly 
		System.out.println(Static_variable.i); //static variable can call using class name  
		System.out.println(x); // since it is a instance variable we need to creae an objectf fro this 
		
	}

}
