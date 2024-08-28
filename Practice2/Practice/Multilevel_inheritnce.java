package Practice;
class bird
{
	void fly()
	{
		System.out.println("flying"); 
	}
    }
class peacock extends bird
      {
            void dance()
            {
            	System.out.println("peacock dancing");
            }
            
     }

class babypeacock extends peacock 
       {
 	           void fly1()
 	           {
 	        	   System.out.println("baby peacock flying");
 	           }
       }


public class Multilevel_inheritnce {

	public static void main(String[] args) {
		
		babypeacock bp = new babypeacock();
		bp.fly();
		bp.dance();
		bp.fly1();
	
		peacock p = new peacock();
		p.fly();
		//p.fly1(); // not possible 
		p.dance();
		
		
		
		

	}

}
