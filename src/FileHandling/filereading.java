package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class filereading {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try{    
            FileInputStream fin=new FileInputStream("D:new.txt");    
              int i=0;
              
              while((i=fin.read())!=-1)
              {
            	  System.out.println((char)i); 
              }
             fin.close();    
          }
		catch(Exception e){System.out.println(e);
		}    
		
          
	//writing data into a file	
      
       try {
		FileOutputStream fout=new FileOutputStream("D:new.txt");
		
		String s= "anil";
		
	      byte b[]=	s.getBytes();
	      fout.write(b);
	      fout.close();
		  System.out.println("success");
		
	       } 
       catch (FileNotFoundException e) 
       {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}
}