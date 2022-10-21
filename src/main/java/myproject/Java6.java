package myproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Java6 {
	
	
	  void create() {
		 

			    // create a file object for the current location
			    File file = new File("new.txt");

			    try {

			      // trying to create a file based on the object
			      boolean value = file.createNewFile();
			      if (value) {
			        System.out.println("The new file is created.");
			      }
			      else {
			        System.out.println("The file already exists.");
			      }
			    }
			    catch(Exception e) {
			      e.getStackTrace();
			    }
			  }
			
  
  void writ() {
	  String data = "This is the data in the output file";
	     try {
	       // Creates a Writer using FileWriter
	       FileWriter output = new FileWriter("new.txt");

	       // Writes string to the file
	       output.write(data);
	       System.out.println("Data is written to the file.");

	       // Closes the writer
	       output.close();
	     }
	     catch (Exception e) {
	       e.getStackTrace();
	     }
	  }

	 void rea() throws IOException {
		 char[] array = new char[100];
		    try {
		      // Creates a reader using the FileReader
		      FileReader input = new FileReader("new.txt");

		      // Reads characters
		      input.read(array);
		      System.out.println("Data in the file:");
		      System.out.println(array);

		      // Closes the reader
		      input.close();
		    }
		    catch(Exception e) {
		      e.getStackTrace();
		    }}
  

	public static void main(String args[]) throws IOException {
	
		Java6 java = new Java6();
		java.create();
		
			java.writ();
			java.rea();
				

		


	}}
	

