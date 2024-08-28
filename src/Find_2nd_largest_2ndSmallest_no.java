
public class Find_2nd_largest_2ndSmallest_no {

	public static void main(String[] args) {

		/*
		 * //for sorted array 
		 * int x[]= {1,2,3,4}; 
		 * int size = x.length;
		 
	 	*System.out.println(size-3);
       */
		
		int a[] = {3,2,34,4,};
		
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}

			}
			//System.out.println(a[i]);
		}
		int size1= a.length;
		
		//for(int i=0;i<a.length;i++)
		
			System.out.println(a[size1-2]);
		
		
		
	}

}
