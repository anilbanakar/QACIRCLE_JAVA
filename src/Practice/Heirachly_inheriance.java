package Practice;

   class tree{
	   void providefood()
	   {
		   System.out.println("tree provide food to animalas");
	   }
   }
   
   class Mango extends tree{
	   
	   void flavor()
	   {
		   System.out.println("this will one type of flavor");
	   }
	   
   }
   
   class apple extends tree
   {
	   void protien()
	   {
		   System.out.println("gives protien");
	   }
   }
  

public class Heirachly_inheriance {

	public static void main(String[] args) {
		
		apple a = new apple();
		a.protien();
		a.providefood();
		
		Mango m = new Mango();
		m.flavor();
		m.providefood();
		
		
	}

}
