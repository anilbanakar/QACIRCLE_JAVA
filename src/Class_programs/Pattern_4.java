package Class_programs;

public class Pattern_4 {

	public static void main(String[] args) {
		
		/* o/p
		 * 4 3 2 1
		 * 3 2 1
		 * 2 1
		 * 1	 
		 */
		
		for(int i=4;i>=1;i--)
		{
			for(int j=i;j>=1;j--)  
			{
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
