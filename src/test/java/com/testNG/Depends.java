package com.testNG;

import org.testng.annotations.Test;

public class Depends {
	 
	static String trackid = null;
	
  @Test
  public void createshipment() throws Exception {
	  
	//  System.out.println(5/0);
	  
	  System.out.println("createshipment");
	  trackid ="dakjfl";
	
  }
  @Test(dependsOnMethods= {"createshipment"})
  public void trackshipment() throws Exception {
	
 if(trackid !=null) {
		  
	  System.out.println("tshipment");
		  
	  }
	  else {
		  throw new Exception("invailid-shipment ");
	  }
  }
  
  @Test(dependsOnMethods= {"createshipment"})

  public void cancelshipment() throws Exception {
	 
	 
 if(trackid !=null) {
		  
	 System.out.println("cshipment");
		  
	  }
	  else {
		  throw new Exception("invailid-shipment ");
	  }
  }
}
