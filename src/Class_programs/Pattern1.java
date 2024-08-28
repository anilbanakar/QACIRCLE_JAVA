package Class_programs;

public class Pattern1 {

	public static void main(String[] args) {
 
		
		//int num=4;
		
		for(int i=0;i<=3 ;i++)
		{
			   for(int j=0;j<=3;j++)
			    {
				   
				 if(i==0 || i==3 || j==0|| j==3)  {    // output should be      //* * * *
					                                                            //*     * 
			                                                                    //*     *
					                                                            //* * * *
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
