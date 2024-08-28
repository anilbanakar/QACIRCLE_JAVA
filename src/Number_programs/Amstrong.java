package Number_programs;

public class Amstrong {

	public static void main(String[] args) {


		int a=371;
		int originalnumber =a;
		int reminder, result = 0;
		
		while(originalnumber>0)
		{
			reminder = originalnumber%10;
			result+= Math.pow(reminder, 3);
			originalnumber= originalnumber/10;
		}
		if(result==a)
		{
			System.out.println("no is amstrong");
		}
		else
		{
			System.out.println("no is not amstrong");
		}
	}

}
