package Class_programs;

public class Pattern3_ex {

	public static void main(String[] args) {
		
		/* o/p
	      1 2 3 4
	      1 2 3
	      1 2  
	      1 
	      */
		
		for(int i=4;i>=1;i--)   
		{
			for(int j=1;j<=i;j++) 
			{
	 			System.out.print(j);
			}
		  System.out.println();	
		}
	}

}
