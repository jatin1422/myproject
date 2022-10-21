package com.testNG;

import org.testng.annotations.Test;

public class Depends3 {

@Test(groups= {"smoke"})
public void smo()
{
	System.out.println("smoke");
}



@Test(groups= {"sanity"})
public void san()
{
	System.out.println(4/0);
	System.out.println("sanity");

}




@Test(groups= {"smoke"})
public void reg()
{
	System.out.println("regression");

}





}
