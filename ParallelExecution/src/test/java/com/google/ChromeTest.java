package com.google;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;

public class ChromeTest {
// Parallel Execution
	
	WebDriver driver;

	@Test
	public void LunchGooleC() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement name = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		name.sendKeys("Irudaya");
		driver.quit();
	}

	@Test
	public void FirFox() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement name = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		name.sendKeys("Irudaya");
		driver.quit();
	}

	@Test
	public void Safari() {
		WebDriverManager.safaridriver().setup();
		driver = new SafariDriver();

		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement name = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
		name.sendKeys("Irudaya");
		driver.quit();
	}
}