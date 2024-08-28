package Constructor_overloadingEX;

public class Pen {

	
	String brand;
	double price;
	
	Pen()
	{
		System.out.println("this is default constructor");
	}
	Pen(String brand1,double price1)
	{
		System.out.println("this is 1st constructor");
		brand=brand1;
		price=price1;
	}
	
	Pen(String brand1)
	{
		System.out.println("this is 2nd constructor");
		brand=brand1;
	}
	
}
