package Array_pgms;

import java.util.Scanner;

public class findhowmany_no_are_even_odd_in_array {

	public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     System.out.println("enter array size"); 
     int n= sc.nextInt();
     
     System.out.println("enter array e"); 
     int a [] = new int [n];
     for(int i=0;i<n;i++)
     {
    	 a[i]=sc.nextInt();
     }
     
    // Boolean status=false;
     for(int i=0;i<n;i++)
     {
    	 if(a[i]%2==0)
    	 {
    		 System.out.println("no is even");
    		// status=true;
    	 }
    	 
    	 else
    	 {
    		 System.out.println("no is odd");
    	 }
    	  }
    // if(status=false)
     
	}

}
