package Array_pgms;

import java.util.Scanner;

public class Find_duplicate_ele_in_array_Strings {

	public static void main(String[] args) {
		
		String a[] = {"java", "python","e" };

		Boolean staus= false;
		 for(int i=0;i<a.length;i++)
		 {
			 for(int j=i+1;j<a.length;j++)
			 {
				 if(a[i]==a[j])
				 {
					 System.out.println("duplicate element is: "+a[i]); 
					 staus=true;
				 }
					/*
					 * else { System.out.println("duplicate ele not found"); // this will print 3
					 * times so use out side for loop }
					 */
			 }
		 }
			
			  if(staus==false) {
				  System.out.println("duplicate ele not found"); 
				  }
			  
			 
	}

}
