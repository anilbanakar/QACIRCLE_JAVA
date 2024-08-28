package Interface;
//Note This is ex for multiple SinglelevelInheritance as well

public class Taxcalculation implements Centraltax,Statetax {

	
	public void fuel() 
	{
		System.out.println("central tax for fuel ");	
	}

	
	public void clothtax() {
		
		System.out.println("state tax for cloth");
		
	}

	
	
}

