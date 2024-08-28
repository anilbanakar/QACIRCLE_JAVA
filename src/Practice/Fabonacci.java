package Practice;

public class Fabonacci {

	public static void main(String[] args) {

		int a=0;
		int b=1;
		int c;
		
        for(int i=1;i<20;i++)
        {
        	c=a+b;
        	a=b;
        	b=c;
        	System.out.println(c);

        }
		
				
	}

}
