package Practice;

public class Pattern1 {

	public static void main(String[] args) {
		
/*
		* * * *
		* * *
		* *
		* 
*/		
		
/*
 * for(int i=0;i<=4;i++) 
 * {
 *  for(int j=i+1;j<=4;j++) // i=1 j is 2 {
 * System.out.print(" * ");
 *  } 
 *  System.out.println(" ");
 * 
 * System.out.println();
 *  }
 */
		
		
/*
      *
      * * 
      * * *
      * * * *
 */
		
	 for(int i=0;i<=4;i++)
	 {
		 for(int j=0;j<i;j++)
		 {
			 System.out.print("*");
		 }
		 System.out.println();
	 }
		
		
	}

}
