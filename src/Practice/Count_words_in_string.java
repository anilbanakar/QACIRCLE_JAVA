package Practice;

public class Count_words_in_string {

	public static void main(String[] args) {
		
		String s = "iam iam java java java jj cc";
		
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ' && (s.charAt(i+1)!=' '))
              {
		       count++;
	
                }
			
		}
		System.out.println(count); 
		
		

	}

}
