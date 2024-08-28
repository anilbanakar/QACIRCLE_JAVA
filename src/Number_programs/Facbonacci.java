package Number_programs;

public class Facbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=0;
		int b=1;
		int c=0;
		
		System.out.println(+a+ "\n"+b);
		for(int i=0;i<=20;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	
	}

}
