package Class_programs;

public class Pattern5 {

	public static void main(String[] args) {
	/* o/p
	 * 1 
	 * 12
	 * 123
	 * 1234
	 * 123
	 * 12
	 * 1 
	 */
		int row=7;
		int mid=row/2+1;
		int col=1;
		
		
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=col;j++)       // 1st=1<=1 , 2<=1 false     1
				        	  	           // 2nd 1<=1,2<=1            1 2   , 123, 1234 , 123
			{         
				System.out.print(j);
			}
			System.out.println();
			if(i<mid)
			{
				col++;
			}
			else {
				col--;
			}
				
			
		}
	}

}
