package Class_programs;

public class pattern_11 {

	public static void main(String[] args) {
		
		/*
		        *
		      * *
		    * * *
		  * * * *
		 */
		 // not getting output
		int row= 6;
		int space = row-1;
		int star =1;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=space;j++) // this is for space
			{
				System.out.print(" ");
			}
				for(int k=i;k<=star;k++) // this is to print star
				{
					System.out.print("*");
				}
		 System.out.println();	
		  space--;
		  star++;
		}
		 
		
		
	}
		
}


