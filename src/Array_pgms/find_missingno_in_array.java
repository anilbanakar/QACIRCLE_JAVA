package Array_pgms;

public class find_missingno_in_array {

	public static void main(String[] args) {

        int a[] = {1,2,3,5} ; 
        
		int x;
		  int sum=0; for(int i=0;i<a.length;i++) 
		  {
			  sum=sum+a[i]; 
			  }
		  System.out.println(sum);
		   
        
        int sum1=0;
		for(int i=1;i<=5;i++)
		{
			sum1=sum1+i;
		}
		System.out.println(sum1);
		
		x= sum1-sum;
		System.out.println("missing no is " + x);
		
		
	}

}
