package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Star {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement text = driver.findElement(By.id("twotabsearchtextbox"));
		text.sendKeys("iphone",Keys.ENTER);
		
		
		
		WebElement mOver = driver.findElement(By.xpath("//div[@id='averageCustomerReviews']"));
		
		Actions actions = new Actions(driver);
		actions.moveToElement(mOver).perform();
	}

}
