
public class Find_dup_ele_inarray {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,2,4,4};
		
	
		Boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
					flag=true;
				}
			}
			if(flag==false)
			{
				System.out.println("duplicaet not found");
			}
		}
	}

}
