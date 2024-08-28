package Array_pgms;

public class Find_dup_ele_inarray_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int a[] = {1,2};
		
		Boolean flag = false;
		for (int i=0;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("dupliate element " + a[i]);
					flag=true;
				}
			}	
				
		}
		if(flag==false)
		{
			
		System.out.println("duplicate element not found");
		}
		
	}

}

		
		
		