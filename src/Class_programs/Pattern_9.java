package Class_programs;

public class Pattern_9 {

	public static void main(String[] args) {
		
		/*
	     * * * *     00 01 02 03
		 *  *  *     10 11 12 13 
         * *   *     21 22 23 24 
		 * * * *     31 32 33 34
	      
	*/  	
		
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=3;j++)
			{
				if(i==0 |i==3 |j==0| j==3 |j==i+1| j==i-1) 
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" "); 
				}
			}
			System.out.println();
		}
		
		
	}

}
