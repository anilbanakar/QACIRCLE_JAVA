package Variables;

public class Variable2 {
	
	static int b=20; // static variable and this can call without creating an object , we can call by using class name
	  int c;         // this is non static variable need to create an object
	
	  
	  void display() // Since its a non static method we need to call this method using object reference
	  {
		  int x,y; // A local variable can not be definied with static keyword
		           //these are local variables will execute when method is called and once local variables is declared we must inialized beore calling a method
          x=30;
          y=20;
          System.out.println(x); // in methods 
	  }
	  
	  
	  static void sum(int p, int q) // since this method is static method we can call directly without creating object 
	  {                             // we can't override the static methods 
		                             // we can not declare a static methods 
		                             //we can overload satic methods 
		                             // innner class can be static , normal class can not be a static
		                              //Constructr can not be static
		  p=10;
		  q=20;
		  System.out.println(p);
		  System.out.println(q);
	  }
	  
	public static void main(String[] args) { // we can't override main method because it is static method 
		
		//static int a=10; // we can not call static variables in methods 
		Variable2 v = new Variable2(); //this is object created
		v.c=10;
		System.out.println(v.c); // or you can assign the 30 in this stmt as weill like syso(v.c=30)
		System.out.println(Variable2.b); //static variable and this can call without creating an object , we can call by using class name
	
		v.display(); //non static method called using object reference 
		Variable2.sum(b, b); // this is static metod so called without object reference  
	
	}

}
