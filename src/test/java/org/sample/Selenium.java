package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		WebElement findElement = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		findElement.click(); 
		Thread.sleep(3000);
		
		WebElement frtnanme = driver.findElement(By.name("firstname"));
		frtnanme.sendKeys("prabhu");
		WebElement lstname = driver.findElement(By.name("lastname"));
		lstname.sendKeys("thavasumani");
		
	
	
	
	}
	

}
