package Practice;


//one child have more than one parent this is called Hierarchly_inheritance


class bank {
	  void loans()
	  {
		  System.out.println("interrest rate is fixed");
	  }
	  
	 class homeloan extends bank
	 {
		 void homeloan1()
		 {
			 System.out.println("interest is 8%");
		 }
	 }
	 
	 class carloan extends bank
	 {
		 void carloan1()
		 {
			 System.out.println("interest is 7%");
		 }
	 }
	 
}	 

      public class New {

	 public static void main(String[] args)
	   { 
		carloan car = new carloan();
        car.loans();
        car.carloan1();
     
     homeloan hm = new homeloan();
     hm.homeloan1();
     hm.loans();
		

	
 }
    }





