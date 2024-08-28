package Array;

import java.util.Arrays;

public class Different_ArraysMehods {

	public static void main(String[] args) {
		
		//Arrays.toString()
		//Arrays.toChararray()
		//Arrays.lengh()
		//Arrays.sort()
		//Arrays.fill()
		//Arrays.copyof()
		
	// This is - copyof() method ex
	  	int a[]= { 1,2,3};
	 
		
		//System.out.println(a.length);
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);  
		}
		
		System.out.println("copied array");
		
		int [] arrcopy = Arrays.copyOf(a, a.length );
		
		for(int i=0;i<arrcopy.length;i++)
		{
			System.out.println(arrcopy[i]);
		}
		
	    System.out.println(Arrays.copyOf(a, a.length));
	
		
		
		 //This is - fil() method ex
	/*	int a[] = { 1,2,3,4,5};
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]); 
		}
		
		int replace =3;
		int a1[] = new int[5];
		
		Arrays.fill(a, replace); // jus this will 3 in next index in original array
	    Arrays.fill(a, 1, 4, replace);  // its adding next 3 for next 5 values 
	    
	    for(int value : a)  
	    
	    System.out.println(value);
	    
	 //   System.out.println(replace);
*/	    
	    	
		
	}

}
