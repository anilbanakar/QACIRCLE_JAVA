package Practice;

public class Prime_number {

	public static void main(String[] args) {
		
		int a=11;
		int count=0;
		if(a>1)
		{
			for(int i=1;i<12;i++)
			{
				if(a%i==0)
				{
					count++;
				}
			}
		
		if(count==2)
		{
			System.out.println("no is prime"); 
		}
		else
		{
			System.out.println("no is not prime");
		}
		}
		
	}

}
