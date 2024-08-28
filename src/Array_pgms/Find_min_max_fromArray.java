package Array_pgms;

public class Find_min_max_fromArray {

	public static void main(String[] args) {

         int a[] = {10,20,30};
         
         int max=10;
         int min=10;
			/*
			 * for(int i=0;i<a.length;i++) 
			 * {
			 *  if(a[i]>max) 
			 * {
			 *  max=a[i];
			 *   }
			 *   }
			 * System.out.println(max);
			 */ 
        
         for(int i=0;i<a.length;i++)
         {
        	 if(a[i]<min)
        	 {
        		 min= a[i];
        	 }
         }
         System.out.println(min);
	}

}
