package ABstarctMethod_EX;

abstract class Hero {
	 
   void body()
   {
     System.out.println("here will prepair the engine") ;
   }
	abstract void engine();
	 {
		 // here there is no implementation 
		
	 }
 }

 class Honda extends Hero
 {
	void engine() // its implemented in child class
	{
		System.out.println("hond will assemble the bike parts");	
	} 
 }

public class AAbstractExample {

	public static void main(String[] args) {
		
		Honda h = new Honda();
		h.engine();
		h.body();
	
	}

}
