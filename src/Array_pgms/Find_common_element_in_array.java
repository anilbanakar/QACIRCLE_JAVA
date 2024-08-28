package Array_pgms;

import java.util.Scanner;

public class Find_common_element_in_array {

	public static void main(String[] args) {
		
		
		int a1 []= {1,2,3,4,5};
		int [] a2 = {1,2,3};
		
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a2.length;j++)
			if(a1[i]==a2[j])
			{
				System.out.println(a1[i]);
			}
		}
		
		
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("enter array size");
		 * int n = sc.nextInt() ;
		 * 
		 * System.out.println("enter array elements"); int a[] = new int[n]; for(int
		 * i=0;i<n;i++) { a[i]=sc.nextInt(); } int temp; for(int i=0;i<n;i++) { for(int
		 * j=0;j<n;j++) { if(a[i]==a[j]) { temp=a[i]; a[i]=a[j]; a[j]=temp;
		 * 
		 * } System.out.println(a[i]); } }
		 * 
		 */
	}

}
