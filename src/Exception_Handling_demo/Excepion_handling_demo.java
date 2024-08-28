package Exception_Handling_demo;

public class Excepion_handling_demo {

	public static void main(String[] args) {

		try {
			System.out.println(10/0);   
			String s = null;
			System.out.println(s.length());
		     }
			catch(ArithmeticException | NullPointerException e)
			{
			 System.out.println("NullPointerException");	
			}
		   finally
		   {
			   System.out.println("fianllly");
		   }

	}

} 
