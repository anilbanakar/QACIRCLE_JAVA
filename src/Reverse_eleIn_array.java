
public class Reverse_eleIn_array {

	public static void main(String[] args) {
		
		int a[] = {3,4,1,2};
		
		/*
		 * int temp; for(int i=0;i<a.length;i++) { for(int j=i+1;j<a.length;j++) {
		 * if(a[i]<a[j]) { temp=a[i]; a[i]=a[j]; a[j]=temp;
		 * 
		 * } } } for(int i=0;i<a.length;i++) { System.out.println(a[i]); }
		 */
		
		// this flow is simple
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]); 
			
		}

	}

}
