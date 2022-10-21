package com.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OptionalParam {
	
	WebDriver driver;
	
	
	@Parameters("browse")
	@Test
	public void browser(@Optional("chrome")String browse) {
		
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
		
		switch(browse) {
	
		case ("chrome") :
		 driver = new ChromeDriver();
		break;

		case ("firefox") :
		driver = new FirefoxDriver();
		break;
		
		
		
		
		
		
		}
		
		driver.get("https://www.google.co.in/");
		
		

	}

}
