package SinglelevelInheritance;

public class Mianclass {

	public static void main(String[] args) {
		
		apple ap= new apple();
		ap.name="apple";  // this is coming from parent class
		ap.color="red"; // this is coming from parent class  
	    ap.pirce=120;
	    ap.weight=2;
	    
	    ap.taste();
	    ap.providevitamin();
	}
	

}
