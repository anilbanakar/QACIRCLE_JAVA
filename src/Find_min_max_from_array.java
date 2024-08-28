
public class Find_min_max_from_array {

	public static void main(String[] args) {
		int a[]= {10,20,30};
		int max=10;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];	
			}
		}	
		System.out.println(max);
	}

}
