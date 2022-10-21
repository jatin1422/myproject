package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class infotest {
	 WebDriver driver;
		
	  @BeforeClass
		public void setup() {
			
			WebDriverManager.chromedriver().setup();
			driver =  new ChromeDriver();
}
	  
	  @Test(dataProvider ="data")
	  public void login(String fn, String ln,String a,String c, String s, String z,String p ,String ss, String un , String Pa , String con ) throws InterruptedException {
		  driver.get("https://parabank.parasoft.com/parabank/index.htm");
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();

		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys(fn);
		  driver.findElement(By.xpath("//input[@id='customer.lastName']")).sendKeys(ln);
		  driver.findElement(By.xpath("//input[@id='customer.address.street']")).sendKeys(a);
		  driver.findElement(By.xpath("//input[@id='customer.address.city']")).sendKeys(c);    //input[@id='customer.address.city']
		  driver.findElement(By.xpath("//input[@id='customer.address.state']")).sendKeys(s); 
		  driver.findElement(By.xpath("//input[@id='customer.address.zipCode']")).sendKeys(z); 
		  driver.findElement(By.xpath("//input[@id='customer.phoneNumber']")).sendKeys(p);
		  driver.findElement(By.xpath("//input[@id='customer.ssn']")).sendKeys(ss); 
		  
		  driver.findElement(By.xpath("//input[@id='customer.username']")).sendKeys(un);
		  driver.findElement(By.xpath("//input[@id='customer.password']")).sendKeys(Pa);
		  
		  driver.findElement(By.xpath("//input[@id='repeatedPassword']")).sendKeys(con);
		  driver.findElement(By.xpath("//input[@value='Register']")).click();
		  
		  Thread.sleep(5000);
		  driver.findElement(By.xpath("//a[normalize-space()='Log Out']")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();

	  }
	
	  @DataProvider (name ="data")
	  public Object[][]data() throws Exception{
		  
		  String path ="C:\\SelinumWebdriver\\EXCELFILES\\Book21.xlsx";
		  
		  
		  XLUtility util = new XLUtility(path);
		  int totalrow = util.getRowCount("sheet1");
		  
		  int totalcell=util.getCellCount("sheet1", 1);
		 Object logindata [][]=new Object[totalrow][totalcell];
		 
		 for(int i= 1;i<=totalrow;i++) {
			 
		
			 for(int j=0; j<totalcell; j++) {
				 
				 logindata[i-1][j]=util.getCellData("sheet1", i, j);
			 }
		 }
		                                      
		return logindata;
		  
	
	  }
	  
}