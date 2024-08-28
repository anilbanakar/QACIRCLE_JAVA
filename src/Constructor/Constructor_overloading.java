package Constructor;

public class Constructor_overloading {
	
	String carname; 
	String color; 
	Double price;
	
	//Constructor_overloading having multilpe constrcutors with differnt no of parameters/diff type of parameters is called Constructor Overloading
	Constructor_overloading(String carname1,String color1, Double price1)
	{
		
		System.out.println("first constructor");
	    carname= carname1;
	    color= color1;
	   
	}
	
	Constructor_overloading() // this is default constructor 
	{
		System.out.println("default constructor");
	}
	Constructor_overloading(String carname1,String color1)
	{
		System.out.println("3rd constructor");
		carname= carname1;
		color=color1;
	}
	
	public static void main(String[] args) {
		Constructor_overloading co = new Constructor_overloading("swift","white");
		System.out.println(co.carname);
		System.out.println(co.color);
		System.out.println(co.price);
		
		Constructor_overloading co1 = new Constructor_overloading();
		System.out.println(co1.carname); // this will call default constructor since no parameters added 
		
		Constructor_overloading co2 = new Constructor_overloading("desire","green");
		System.out.println(co2.carname);
		System.out.println(co2.color);
	}

}
