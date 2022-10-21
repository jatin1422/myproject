package myproject;
public class Java4 {
	   public static void main(String argu[]) {
	      String str = "JackandJill";
	      char[] carray = str.toCharArray();
	      
	      System.out.println("All  duplicates characters are :");
	      for(int i =0;i<carray.length ;i++) {
	    	  for(int j =i+1; j<carray.length;j++) {
	    		   if(carray[i]==carray[j]) {
	    			   System.out.print(carray[j]+"  ");
	    			    break;
	    		   }
	    	  }
	      }
	      
	      
	      
	   }}
	    