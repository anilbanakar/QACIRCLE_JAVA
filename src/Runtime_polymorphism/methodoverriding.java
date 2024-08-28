package Runtime_polymorphism;

class rbi
{
	void rateofintrest()
	{
		System.out.println("rbi intrest rate is 12%"); // this is implementation 
		
// methodoverriding: changing iplementation of super class in sub class is called methodoverriding	
	}
}
 class HDFC extends rbi
 {
	 void rateofintrest()
	 {
		 System.out.println("rbi intrest rate is 10%");
	 }
 }
 class SBI extends rbi
 {
	 void rateofintrest()
	 {
		 System.out.println("sbi intrest rate is 11%");
	 }
 }


public class methodoverriding {

	public static void main(String[] args) {
		
		HDFC hdfc = new HDFC();
		hdfc.rateofintrest();
		
		rbi rb = new rbi(); // this is not rquired since this is overloaded in child classes 
		rb.rateofintrest();  
		
		SBI sbi = new SBI();
		sbi.rateofintrest();
		
		
	}

}
