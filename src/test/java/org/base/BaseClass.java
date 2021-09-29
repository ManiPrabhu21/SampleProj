package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	WebDriver driver;

	//browser launch

	public WebDriver browserLaunch(String browser) {

		switch (browser) {
		
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "ff":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();	

		default:
			System.out.println("invalid browser");
			break;
		}
		return driver;

	}
	//url launch
	public void launchUrl(String refurl) {
		driver.get(refurl);
		driver.manage().window().maximize();

	}


	//finding locators
	public WebElement findLocators(String s ,String locator, WebElement element) {		
		switch ("locator") {
		case "id":
			driver.findElement(By.id(s));
			break;

		case "name":
			driver.findElement(By.name(s));
			break;

		case "Xpath":
			driver.findElement(By.xpath(s));
			break;
		default:
			System.out.println("invalid locators");
			break;
		}
		return element;

	}

	//click

	public void btnClick (WebElement element) {
		element.click();
		
		
	}

	//SendKeys
	
	private void inputData(WebElement element,String s ) {
		element.sendKeys(s);
		
	}

      private String getText(WebElement element) {
		String text = element.getText();
		return text;

	}








}










