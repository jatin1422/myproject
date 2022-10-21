package myproject;

import java.util.*;
abstract class Book
{
   String title;
   abstract void setTitle(String s);
   String getTitle()
   {
      return title;
   }
   
}


 class NewBook extends Book
{
    void setTitle(String s)
    {
        title = s;
    }
    
}

public class Java1
{
   
   public static void main(String []args)
   {
	   System.out.println("enter a text");
      Scanner sc=new Scanner(System.in);
      String title=sc.nextLine();
      NewBook nw =new NewBook();
      nw.setTitle(title);
      System.out.println("The title is: "+nw.getTitle());
    
      
   }
}