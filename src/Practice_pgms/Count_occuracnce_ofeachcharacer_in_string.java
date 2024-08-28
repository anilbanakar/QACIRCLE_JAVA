package Practice_pgms;

import java.util.LinkedHashMap;
import java.util.Map;

public class Count_occuracnce_ofeachcharacer_in_string {


	public static void main(String[] args) {
		
		String s ="anil";
	    //String S1=s.toLowerCase();
	    
		Map<Character,Integer>charcount = new LinkedHashMap<Character,Integer>();
		
		for(int i=0;i<s.length();i++)
		{
		char ch= s.charAt(i);
		if(charcount.containsKey(ch))
		{
			charcount.put(ch, charcount.get(ch)+1);
		}
		else
		{
			charcount.put(ch, 1);
		}
		}
		
		System.out.println(charcount);
		
		
	}

}
