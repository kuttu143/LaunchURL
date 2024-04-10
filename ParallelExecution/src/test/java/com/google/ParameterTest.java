package com.google;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterTest { 
	    // Create first WebDriver reference. 
	    WebDriver driver; 

	    // Set up method to initialize WebDriver based on browser parameter.
	    @Parameters({"chrome"}) 
	    @Test 
	    public void chrome(String chrome) { 
	        
	    	WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			WebElement name = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
			name.sendKeys(chrome);
			driver.quit();
		}
	    @Parameters({"firfox"}) 
	    @Test 
	    
		public void FirFox(String firfox) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			WebElement name = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
			name.sendKeys(firfox);
			driver.quit();
		}
	    @Parameters({"Safari"}) 
		@Test
		public void Safari(String Safari ) {
			WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();

			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			WebElement name = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
			name.sendKeys(Safari);
			driver.quit();
		}
	}


