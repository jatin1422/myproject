package myproject;
import java.util.*;

public class Java2
{
    public static void main(String[] args) 
    {
          
        ArrayList<String> arrlist = new ArrayList<String>(); 
 
        
        arrlist.add("you");         
        arrlist.add("Are");        
        arrlist.add("an");
        arrlist.add("Amazing");
        arrlist.add("person");         
        
                 
        
        System.out.println("Before Reverse ArrayList:");         
        System.out.println(arrlist);
         
              
        Collections.reverse(arrlist);
         
               
        System.out.println("After Reverse ArrayList:");         
        System.out.println(arrlist);
    }
} 
