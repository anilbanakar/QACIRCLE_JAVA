import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
	
		HashMap hm = new HashMap();
		hm.put(1, "a");
		hm.put(3, "b");
		
		
		System.out.println(hm); //full set
		System.out.println(hm.get(2)); // null
		
		
		//System.out.println(hm.remove(1)); 
		System.out.println(hm);
		
		System.out.println(hm.keySet()); //[1,3]
		System.out.println(hm.values());//[a,b]
		System.out.println(hm.entrySet()); 
	}

}
