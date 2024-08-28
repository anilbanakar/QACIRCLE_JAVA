package Practice;

public class practice {

	public static void main(String[] args) {
		//* * * *
        //*     * 
        //*     *
        //* * * *
		
		/* o/p
	      1 
	      1 2
	      1 2 3 
	      1 2 3 4
	      */
		
		/* o/p
	      1 2 3 4
	      1 2 3
	      1 2  
	      1 
	      */	
		
		/* o/p
		 * 4 3 2 1
		 * 3 2 1
		 * 2 1
		 * 1	 
		 */
		
		/* 1 
		 * 12
		 * 123
		 * 1234
		 * 123
		 * 12
		 * 1 
		 */
		
    	int row=7; 	
		int col= 1;
		int mid = row/2+1;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=col;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		 if(i<mid)
		 {
			 col++;
		 }
		 else 
		 {
			 col--;
		 }	 
	    }
}
}
