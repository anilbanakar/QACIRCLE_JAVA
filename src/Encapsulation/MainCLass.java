package Encapsulation;

public class MainCLass {

	public static void main(String[] args) {
		
		Bank b = new Bank();
		System.out.println(b.getBranch()); // it will give null values if you not set any value 
		System.out.println(b.getName());  // it will give null values if you not set any value 
		
		b.setBranch("blr");
		b.setName("sbi");
		b.setIFScode("ABC");
	
	    System.out.println(b.getBranch());
	    System.out.println(b.getName());
	    System.out.println(b.getIFScode()); 
	}
	

}
