package Practice;

public class count_noofdigitsingiveninteger {

	public static void main(String[] args) {
		
		int a=12312;
		int count =0;
		while(a>0)
		{
			a=a/10;
			count++;
		}
		System.out.println(count); 
		
		
	}

}
