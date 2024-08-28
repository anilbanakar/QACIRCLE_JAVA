package Practice;

public class COunt_sum_of_digits {

	public static void main(String[] args) {
		
		int a=1232008;
		int sum= 0;
		
		while(a>0)
		{ 
			sum=sum+a%10;  // rev= rev*10+a%10; this is for reverse
			a=a/10;
		}
		   
		System.out.println(sum);
	}

}
