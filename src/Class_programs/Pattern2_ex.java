package Class_programs;

public class Pattern2_ex {

	public static void main(String[] args) {
		
		/* o/p
	      1 
	      1 2
	      1 2 3 
	      1 2 3 4
	      */
	  
		for(int i=1;i<=4;i++)   // 1st-i=1,
		{
			for(int j=1;j<=i;j++) //1st itr j=1, 1<=1 true, j will increment 2nd itr j=2,2<=1=false come out from the loop and outer for loop stamt will execute
				                //1st iteration 1 
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	        
	       
	 }

}
