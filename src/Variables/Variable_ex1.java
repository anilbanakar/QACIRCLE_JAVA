package Variables;

public class Variable_ex1 {

	static int a=10;
	 int b;
	 
	 
	 static void sum()
	 {
		 
/*Question: Can we call/use non static variable in satic method 
   Answer : A static method can call only other static methods, 
            we can use non static and static variable in static method but it won't throw any compile time/run time error ( even if you print it won't print in console)  	 
 */
		 System.out.println(b); // CAN NOT make a static reference to the non static field  
		 
		 b++; //we can't call, it will throw compile time error
		// System.out.println("Sum of a+b");
		 
		 System.out.println(Variable_ex1.a); 
		 
		 Variable_ex1 ex = new Variable_ex1();
		 System.out.println(ex.b);
		 
		 
		 
	 }
	 
	 void display()
	 {
		 int c;
	 }
	 
	 
	public static void main(String[] args) {
		//System.out.println(Variable_ex1.a); // static method can call directly withut creating an objet
		
		Variable_ex1 ex = new Variable_ex1();
		//ex.b=20; // non static method need to create an object 
		
		
		
		

	}

}
