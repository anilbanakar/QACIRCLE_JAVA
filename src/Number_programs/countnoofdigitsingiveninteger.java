package Number_programs;

public class countnoofdigitsingiveninteger {

	public static void main(String[] args) {


		int a=333455;
		int count=0;
		while(a>0)
		{
			a=a/10;
			count++;
		}
		System.out.println(count); 
		
		
	}

}
