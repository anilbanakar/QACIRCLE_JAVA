package Constructor;

public class Parameterized_constructor {
	

	String brand;  // NOTE:  these are instance variables 
	String color;
	String storage;
	
	Parameterized_constructor (String brand1,String color1, String storage1)  
	{
		System.out.println("i am parameterized constructor");
		brand=brand1; 	    // NOTE: these are local variables as well bcs its inside a method
		color =color1;
		storage=storage1;
		
	}
	
	public static void main(String[] args) {
		
		Parameterized_constructor pc= new Parameterized_constructor("iphone","green","1gb");
		Parameterized_constructor pc1 = new Parameterized_constructor("vivo","red","2gb");  // when call constructor each object will create
		
		
		System.out.println(pc.brand);
		System.out.println(pc.color);
		System.out.println(pc.storage);
	}

}
