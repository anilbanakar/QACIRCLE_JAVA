package Array;

public class Findsmallestelemt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//find smalles element in array
		
		int a[]= {4,3,6,1,5,10};
		
		int size=a.length;
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				 
			}
			System.out.println(a[i]);  	
		}
		System.out.println(a[size-3]);
		
	}

}
