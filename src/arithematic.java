import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class arithematic {

	public static void main(String[] args) {
		  
		  

		String [ ] variables= new String[10];
		//String [ ] values1 = new String[10];
		//String [ ] values2 = new String[10];
		String [ ] operators= new String[10];
		int [] result = new int[10];
		
		 String vari=null;
		 String eq=null;
		 String inttempe=null;
		 int inte1=0;
		 int inte2=0;
		 String opLook=null;
		 int spaceloca =0;
		 int length=0;

    File file = new File("D:/workspace/APlab02/file.txt");
    FileInputStream fis = null;
    BufferedInputStream bis = null;
    DataInputStream dis = null;
    
   
    try {
        fis = new FileInputStream(file);

        // Here BufferedInputStream is added for fast reading.
        bis = new BufferedInputStream(fis);
        dis = new DataInputStream(bis);

        // dis.available() returns 0 if the file does not have more lines.
        while (dis.available() != 0) {
        	int i=0;

        // this statement reads the line from the file and print it to
          // the console.
      	  String temp=dis.readLine();
      	//Unit test for file read is ok!
      	  // System.out.println(temp);
      	  spaceloca=temp.indexOf(" ");
      	  length=temp.length();
      	  eq=temp.substring(spaceloca,length);
      	System.out.println(eq);
      	spaceloca=eq.indexOf("+");
      	length=eq.length();
      	inttempe= eq.substring(0,spaceloca);
      	inte1= Integer.parseInt(inttempe);
      	inttempe=eq.substring(spaceloca+1,length);
      	inte2= Integer.parseInt(inttempe);
      	
      	//checkers for op
      	  
      	
      	  
        }
      	  
      	// dispose all the resources after using them.
          fis.close();
          bis.close();
          dis.close();

        } 
        
        catch (FileNotFoundException e) {
          e.printStackTrace();
        } 
        
        catch (IOException e) {
          e.printStackTrace();
        }
	}
    
}
