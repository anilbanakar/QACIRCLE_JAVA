package FileHandling;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//import javax.swing.plaf.synth.SynthOptionPaneUI;

public class FileReader {

	public static void main(String[] args) throws IOException {
		
		//create a new file
		/*
		 * 	try
		{
		File fo = new File("D:new.txt");

		if(fo.createNewFile())
		{
			System.out.println("file is created");
		}
		else	
		{
			System.out.println("file exists");
		}	}
		 catch(IOException exception) {  
             System.out.println("An unexpected error is occurred.");  
             exception.printStackTrace();  
		 }
		} 
*/	
		
		//writing data into a file
/*		
 *   try {
	FileWriter fr = new FileWriter("D:new.txt");
	fr.write("HI");
	
	fr.close();
		}
	catch(Exception e)
	{
		System.out.println("unexpected error");
		e.printStackTrace();
	}
	}
	}
	
	*/
		// Reading data from file using file reader
		//// to read file use "File" insead of FileWrite, in javapoint used same
		/*
		 * try 
		 * {
		 *  // Create f1 object of the file to read data
		 *   File f1 = new File("D:FileOperationExample.txt"); 
		 *   Scanner dataReader = new Scanner(f1);
		 *   while (dataReader.hasNextLine()) 
		 *   {
		 *    String fileData = dataReader.nextLine();
		 * System.out.println(fileData); 
		 * } 
		 * dataReader.close(); 
		 * } catch
		 * (FileNotFoundException exception) {
		 * System.out.println("Unexcpected error occurred!");
		 * exception.printStackTrace(); }
		 */
		
			
		//delete file 
		/*
		 * File f0 = new File("D:FileOperationExample.txt");  
		 * if (f0.delete()) {
		 * System.out.println(f0.ge	tName()+ " file is deleted successfully.");
		 *  }
		 *   else 
		 *   {
		 * System.out.println("Unexpected error found in deletion of the file."); 
		 * } 
		 */
		
		
        //File input stream It is used for reading data from file (can also use file reader)
		
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
		
          
		//FileoutputStream is used to write datat into a file
	
      
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
	

  
	}}	
