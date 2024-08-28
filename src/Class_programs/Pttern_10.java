package Class_programs;

public class Pttern_10 {

	public static void main(String[] args) {
		
/*
		1
	      2 
	        3
 	          4
	        3
	      2   
	    1
*/
		int row=7;
		int mid = row/2+1;
		int col=1;
		
		
	    for(int i=1;i<=7;i++)
	    {
	    	for(int j=1;j<=col;j++)
	    	{
	    		
	    	 if(i==1 |j==1)	{
	    		System.out.print(j);
	    	}
	    	else
	    	{
	    		System.out.println(" ");
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
}	
	

