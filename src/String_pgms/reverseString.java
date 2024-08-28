package String_pgms;

public class reverseString {

	public static void main(String[] args) {
     	
		String s1= "java";
		String s2="";
		
		int s3=s1.length();
		for(int i=s3-1;i>=0;i--)
		{
			s2=s2+s1.charAt(i);
		}
		System.out.println(s2); 
	}

}
