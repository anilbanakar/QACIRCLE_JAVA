package Practice;

import java.util.Scanner;

public class WAP_erfet_no {

	public static void main(String[] args) {
		
		
	   long sum=0;
     Scanner sc = new Scanner(System.in);
     System.out.println("enter no number");
     long n = sc.nextLong();
     int i=1;
     while(i<=n/2)          //1<=20/2
     {
    	 if(n%i==0)        //1st28%1==2, 28%1==0->14
    	 {
    		 sum=sum+i;
    	 }
           i++;
     
    	 if(sum==n)
    	 {
    		 System.out.println(n+ "no is perfect no");
    	 }
    	 else {
   		 System.out.println(n+ " no is not perfect");
    	 }
   
     }
	}
     
}
