package Class_programs;

public class Reverse_pyramid {

	public static void main(String[] args) {
		
		//6 to 1

		//System.out.println("hi");
	/*	int row =5;
		
		for(int i=row;i>=1;i--)
		{
			for(int space=1;space<=row-i;space++)
			{
				
				System.out.print("  ");
			}
			 for(int j=i; j<=2*i-1;j++)
			 {
				 System.out.println("* ");
			 }
			 for(int j=0;j<=i-1;j++)
			 {
				 System.out.println("* ");
			 }		 
			
	System.out.println();
		}
	*/
	
		int rows=5;
		for(int i = rows; i >= 1; i--)
		{
		     for(int space = 1; space <= rows - i; space++) 
		      {
		        System.out.print("  ");
		      }
              
		      for(int j=i; j <= 2 * i - 1; j++) {
		        System.out.print("* ");
		      }

		      for(int j = 0; j < i - 1; j++) {
		        System.out.print("* ");
		      }
		      

		      System.out.println();
	
		}
	}

}
