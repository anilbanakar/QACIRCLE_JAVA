package Array_pgms;

import java.util.Scanner;

public class Search_elementin_array {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("enter array size");
		int n = sc.nextInt();
		
		System.out.println("enter array elements");
		int a[]= new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		/*
		 * System.out.println("seach element"); for(int i=0;i<n;i++) {
		 * a[i]=sc.nextInt(); }
		 */
		

		System.out.println("seach element");
		int search = 0; 
		search= sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			if(a[i]==search)
			{
				System.out.println("element present in array"); 
			}
			else
			{
				System.out.println("element not present in array"); 
			}
			
	
			
		}
		
	}

}
