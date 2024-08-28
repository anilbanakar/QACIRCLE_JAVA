package Programs;

public class Count_words {

	public static void main(String[] args) {
		
		
		String s = "Java c++";
		//int i=s.length();
		
		int count =0;
		for(int i=0;i<s.length();i++)
		{
		
		if((s.charAt(i)==' ' && (s.charAt(i+1)!=' ')))
			 {
 	            count ++; 
          }
	 	
		}	
		System.out.println(count); 

	}

}
