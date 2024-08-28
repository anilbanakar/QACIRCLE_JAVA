package Encapsulation;

public class Bank {
	
	private String name;   // in encapsulation all variables should be private
	private String branch;
	private String IFScode;
	
	
	// this can eb generate automatically from source option
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getIFScode() {
		return IFScode;
	}
	public void setIFScode(String iFScode) {
		IFScode = iFScode;
	}
	
	
	
	

}
