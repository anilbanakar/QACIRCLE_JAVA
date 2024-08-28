package Array_pgms;

import java.util.Arrays;

public class Sort_ele_descending_order {

	public static void main(String[] args) {
		int a [] = {5,2,8,7,1};
		int size=a.length;
		int temp;
		
		System.out.println("before sorting :" + Arrays.toString(a) ); 
	    
	

		for ( int i=0;i<size;i++)
		{ 
			for (int j=i+1;j<size;j++)
			{
				//if(a[i]<a[j]) //  descending order 
				if(a[i]>a[j])// ascending order
				{
					temp=a[i];
					a[i]= a[j];
					a[j]= temp;		
				}	
					
				
			}
			System.out.println(a[i]); 
		}
		
		
	
		

	}

}
