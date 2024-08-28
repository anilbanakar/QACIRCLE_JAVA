package String_pgms;

public class count_a_characters_repeated_in_string {

	public static void main(String[] args) {
	
		String s = "java aaa" ;
		char ch='a';
		int frequency = 0;
		
		//char ch[] = s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
		if(ch==s.charAt(i))
		{
			frequency++;
		}
	
		}
		System.out.println(frequency);
		
		
		
	}

}
