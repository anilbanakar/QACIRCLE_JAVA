package Constructor_chaining;

public class Pen {

	/* Constructor Chaning we can achive this 
     1. within a class
     2. With base class 
	*/
	
	//  1. within a class
	
     String brand;
	 String price;
	
	 Pen()
	 {
		
		 this("cello","10"); // in constructor to call parametrs we have to use this keyword
		 System.out.println("i am a default constructor"); //
	 }
	 
	 // The execution will happen in main class as 
	 //first default constrcutor will execute ,here used this keyword means "this" will calling another constructor it will jump to parameterized constructor,
	 //first stmt will execute then this keyword is used it will jump into default constructor and call the members  
	 
	 Pen(String brand, String price)
	 {
		 
		System.out .println("parameterized constructor");
		this.brand=brand;
		this.price=price;
	 }

	 
//==========================================================================================================	
	  
	 //2. With base class // this ex is avaibale in pentest and cello class 
      
     













}
