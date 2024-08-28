package Practice;

public class Reverse_String {

	public static void main(String[] args) {
		
		
		String str= "i am software tester";
		String [] words=str.split("\\s");
		String reverseword="";
		
		for(String w: words)
		{
		StringBuilder sb = new StringBuilder(w);
		sb.reverse();
		reverseword=reverseword+sb.toString()+ " "; 
		System.out.println(reverseword); 
		}
		
		
		
	}

}
