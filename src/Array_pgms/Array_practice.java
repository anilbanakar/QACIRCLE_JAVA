package Array_pgms;

public class Array_practice {

	public static void main(String[] args) {
      
		/*
		 * int a[] = new int[3];
		 * 
		 * a[0]=1; a[1]=2; a[2]=3;
		 * 
		 * String[] s = new String[1];
		 * 
		 * s[0]="test";
		 * 
		 * System.out.println( a.length);
		 * 
		 * for(int i=0;i<s.length;i++) {
		 *  System.out.println(s[i]); }
		 */
		// 2 dimension array
		
		//int a1[][] = new int[3][3]; // or use below 
		
		
		  int a[][]= {{1,2,3},{3,4,3},{1,1,1}};
		  
		  System.out.println(a.length);
		  
		  for(int i=0;i<3;i++)
		  {
		     for(int j=0;j<3;j++)
		   {
		    System.out.print(a[i][j] +" "); 
		   }  
		     System.out.println();
		  
		  }
	}
}	
		 

	
		
