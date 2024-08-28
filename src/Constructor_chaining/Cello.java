package Constructor_chaining;

public class Cello extends Pen {


	String price;
	
	Cello()
	{
	   super();	 // this will try to match with constructor in super(parent class) with matcing constructor
	    // once main methd execute the jvm will go to parent class default constructor and execute first
	   System.out.println("this is cello constructor"); // 
	}
	
	Cello(String price)
	{
	
		this.price=price;
	}
	
}

