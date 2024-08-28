package String_pgms;

public class countno_of_wordsin_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s= "java j j k";
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
