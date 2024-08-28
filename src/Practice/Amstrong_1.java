package Practice;

public class Amstrong_1 {

	public static void main(String[] args) {
		
		int a =371; 
		int originalnumber=a;
		int reminder,result=0;
		while(originalnumber>0)
		{
			reminder= originalnumber%10;
			//System.out.println("a");
			result+=Math.pow(reminder, 3);	
			originalnumber= originalnumber/10;	
		}
	
		if(result==a)
		{
			System.out.println("no is amstorang");
		}
		else
		{
			System.out.println("not amstong");
		}
		
	}

}
