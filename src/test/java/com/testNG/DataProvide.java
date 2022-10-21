package com.testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvide {
  WebDriver driver;
	
  @BeforeClass
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		driver =  new ChromeDriver();
	
		
	}
  @Test(dataProvider ="logindata",dataProviderClass = DataSupplier.class)
  public void login(String username,String password,String exp) throws InterruptedException {
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
	  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	  
	  if(exp.equals("valid")) {
		  if(driver.getTitle().equals("OrangeHRM")) {
			  
			  driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
			  driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
          Assert.assertTrue(true);
		 
		  }
		  else
		  {
			 Assert.assertFalse(false); 
		  }
	  
	  }
	  
  }
  
  @AfterClass
  public void teardown() {
	  driver.quit();
  }
	
}
