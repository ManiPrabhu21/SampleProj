package com.brokenUrl;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenExample {
	public static void main(String[] args)    {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("iphone",Keys.ENTER);
		WebElement pl = driver.findElement(By.xpath("//span[@class='a-truncate-cut']"));
		String text = pl.getText();
		System.out.println(text);
		pl.click();
		WebElement cart = driver.findElement(By.id("add-to-cart-button"));
		cart.click();
		
		
		
		
		
		
		
		
																																															
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		WebElement user = driver.findElement(By.name("username"));
//		user.sendKeys("8870834433");
//		WebElement pass = driver.findElement(By.name("password"));
//		pass.sendKeys("8870834433");
//		WebElement btnCli = driver.findElement(By.xpath("//button[@type='submit']"));
//		btnCli.click();
//		
//		List<WebElement> links = driver.findElements(By.tagName("a"));
//		int  brokencout = 0;
//		for (int i = 0; i < links.size(); i++) {
//			WebElement link = links.get(i);
//			String attribute = link.getAttribute("href");
//			
//				URL url = new URL(attribute);
//				URLConnection connection = url.openConnection();
//				HttpsURLConnection e = (HttpsURLConnection) connection ;
//				int responseCode = e.getResponseCode();
//				if (responseCode!=200) {
//					brokencout++;
//					System.out.println("broken url name:"+attribute);
//				}
//	
//			
//			
//				
//			}
//			
//		System.out.println("broken url count"+brokencout);
//		driver.quit();
	}

}
