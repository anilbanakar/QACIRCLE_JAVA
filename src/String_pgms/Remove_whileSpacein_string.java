package String_pgms;

public class Remove_whileSpacein_string {

	public static void main(String[] args) {

               String s = "java c=";
               
           String newString=  s.replaceAll("\\s", "");
           System.out.println(newString);     
	}

}
	