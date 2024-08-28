package Number_programs;

public class Prime_number {

	public static void main(String[] args) {
		
		int a=6;
		int count=0;
		if(a>1)
		{
			for(int i=1;i<=a;i++)
			{
				if(a%i==0)
				{
					count++;
				}
			}
		
	  if(count==2)
	  {
		  System.out.println("the no is prime");
	  }
	  else
	  {
		  System.out.println("no is npot prime ");
	  }
	}
	
}	

}
