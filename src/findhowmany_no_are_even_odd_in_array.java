
public class findhowmany_no_are_even_odd_in_array {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4};
		
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				//count++;
				System.out.println(a[i]);
			}
			
		}
		for(int i=0;i<a.length;i++)
		{
		if(a[i]%2!=0)
		{
			System.out.println(a[i]);
		}
		}

		

	}

}
