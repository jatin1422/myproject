package com.testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;




public class Dataprovider {
WebDriver driver;
	
@BeforeClass
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
@Test(dataProvider ="logindata")

  public void logintest(String username,String password,String exp) throws InterruptedException {
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);

	  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	  
	
	  
	  String title = "OrangeHRM";
	  
	  if(exp.equals("valid")) {
		  
		  
	  
	  if(title.equals("OrangeHRM"))
	  {System.out.println(driver.getTitle());
		  Thread.sleep(3000);

		  WebElement d = driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']"));
          d.click();
			driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
			
			
			

		  Assert.assertTrue(true);
		  
		 
	  }
	  
	  else {
		  Assert.assertFalse(false);
		 
	  }}
	  
	  

	 
}
	  
	  
	 
	  
	  
	  
	  
  
  @DataProvider(name = "logindata",indices = {3,4})
  public Object[][] logindata() throws Exception
  
  
  {
	  
	 /* Object[][]data = {
			  {"Admin","admin123","valid"},
			  
			  {"Admin","admin1","Invalid"},
			  {"Admin","admin13","Invalid"},
			  {"Admin","admin3","Invalid"}
			  
	  };
	  */
	  String path ="C:\\SelinumWebdriver\\EXCELFILES\\ur.xlsx";
	  
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
