
public class Find_unique_no_inArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,1,2,3,3,4};
		
	
		for(int i=0;i<a.length;i++)
		{
			int count =0;
			for(int j=0;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
		
		if(count==1)
		{
			System.out.println("unique no's are" + a[i]); 
		}
		}
	}

}
