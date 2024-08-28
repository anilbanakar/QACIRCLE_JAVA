package Class_programs;

public class Primenumber {

	public static void main(String[] args) {
		
		int num=7;
		int count=0;
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0) // 7%1==0-> TRUE,it will check next no, 7%2==0->false ... 7%7==0, TRUE
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("the no is prime no");
		}
		else
		{
			System.out.println("no is not prime no");
		}
	}

}
