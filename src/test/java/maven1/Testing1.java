package maven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing1 {
	
   WebDriver driver;
   
   
      @Test
	void login() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");

		 driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		 
	   Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	   
	   driver.close();

	}
	@Test
      void check()
      {
    	  System.out.println("Check");
      }
}
