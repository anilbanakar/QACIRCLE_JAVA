package Practice;

public class count_occuranceOfcharacter {

	public static void main(String[] args) {
		
	 String s= "abbccc";// TODO Auto-generated method stub
	 
	 int original=s.length();
	 int original1 = s.replaceAll("b", "").length();
	 
	 System.out.println(original-original1);
	 
	
	 

	}

}
