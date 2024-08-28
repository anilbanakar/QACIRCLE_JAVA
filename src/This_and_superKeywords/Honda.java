package This_and_superKeywords;

public class Honda extends Bike{
	
	String name= "honda";

	Honda()
     {
		  String name="honda";	 
      }
 
	Honda(String name)
	{
		System.out.println(name); // this will call first, bcs this is constrcutor and also a method and its a local variable
		System.out.println(this.name); // "This" is variable keyword always points to a current object,x` means this refres to intance variable
	    System.out.println(super.name); //this will call parent opbject
	 
	}
}