package Array;

public class arraytest {

	public static void main(String[] args) {
	
		int a [] = new int [6];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		
		//System.out.println(a.length); // to print 
		 // or use for loop
		 
		// if index is 6 and not initialize value by default it will print 0 
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]); 
		}
		
		
		//oher way to initialize value and print
		
		/*
		 * int a[] = new int[8];
		 * 
		 * int num=1; // i will sr prining from 1 for(int i=0;i<a.length;i++) {
		 * a[i]=num; num++; ///System.out.println(a[i]); // if you won't print use
		 * anoher new for loop and print
		 * 
		 * } for(int i=0;i<a.length;i++) { System.out.println(a[i]); }
		 */
		
		
		
		
		
		
	}

}
