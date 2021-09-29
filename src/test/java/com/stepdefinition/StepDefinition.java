package com.stepdefinition;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
WebDriver driver;
	
	
	@Given("we are on the Adactin Login page")
	public void we_are_on_the_Adactin_Login_page() {
		WebDriverManager.chromedriver().setup(); 
		 driver = new ChromeDriver();
		 driver.get("https://adactinhotelapp.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
				
	}

	@When("we should enter the {string}and {string}")
	public void we_should_enter_the_and(String user, String pass) throws InterruptedException {
		WebElement textuser = driver.findElement(By.id("username"));
		textuser.sendKeys(user);
		WebElement textpass = driver.findElement(By.id("password"));
		textpass.sendKeys(pass);
		Thread.sleep(300);
		WebElement click = driver.findElement(By.id("login"));
		click.click();
	
		
	    
	}

	@When("user should search hotal {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_search_hotal(String Location, String Hotels, String roomtype, String numroom, String checkin, String checkout, String adults, String children) {
	  WebElement loc = driver.findElement(By.id("location"));
	  Select select = new Select(loc);
	  select.selectByVisibleText(Location);
	  
	  WebElement hotal = driver.findElement(By.id("hotels"));
	  Select select2 = new Select(hotal);
	  select2.selectByVisibleText(Hotels);
	  
	  WebElement roomty = driver.findElement(By.id("room_type"));
	  Select select3 = new Select(roomty);
	  select3.selectByVisibleText(roomtype);
	  
	  WebElement roomnum = driver.findElement(By.id("room_nos"));
	  Select select4 = new Select(roomnum);
	  select4.selectByVisibleText(numroom);
	  
	  WebElement checkn = driver.findElement(By.id("datepick_in"));
	  checkn.sendKeys(checkin);
	  
	  WebElement checko = driver.findElement(By.id("datepick_out"));
	  checko.sendKeys(checkout);
	  
	  WebElement adlt = driver.findElement(By.id("adult_room"));
	  Select select7 = new Select(adlt);
	  select7.selectByVisibleText(adults);
	  
	  WebElement cild = driver.findElement(By.id("child_room"));
	  Select select8 = new Select(cild);
	  select8.selectByVisibleText(children);
	  
	  WebElement search = driver.findElement(By.id("Submit"));
	  search.click();
	  
	  WebElement btnCli = driver.findElement(By.id("radiobutton_0"));
	  btnCli.click();
	  
	  WebElement sub = driver.findElement(By.id("continue"));
	  sub.click();
	  
		
	}

	@When("user should book the hotal {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_book_the_hotal(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
		
		WebElement fname = driver.findElement(By.xpath("//input[@id='first_name']"));
		fname.sendKeys(string);
		
		WebElement lname = driver.findElement(By.id("last_name"));
		lname.sendKeys(string2);
		
		WebElement add = driver.findElement(By.id("address"));
		add.sendKeys(string3);
		
		WebElement num = driver.findElement(By.id("cc_num"));
		num.sendKeys(string4);
		
		WebElement type = driver.findElement(By.id("cc_type"));
		Select select = new Select(type);
		select.selectByVisibleText(string5);
		
		WebElement month = driver.findElement(By.id("cc_exp_month"));
		Select select2 = new Select(month);
		select2.selectByVisibleText(string6);
		
		WebElement year = driver.findElement(By.id("cc_exp_year"));
		Select s3 = new Select(year);
		s3.selectByVisibleText(string7);
		
		WebElement cv= driver.findElement(By.id("cc_cvv"));
		cv.sendKeys(string8);	
		
	}

	@When("we should click the login button")
	public void we_should_click_the_login_button() {
		WebElement book = driver.findElement(By.id("book_now"));
		book.click();	
	   
	}

	@Then("we should verify Title have Search Hotel or not")
	public void we_should_verify_Title_have_Search_Hotel_or_not() {
		WebElement ordPrint = driver.findElement(By.id("order_no"));
		String attribute = ordPrint.getAttribute("value");
		System.out.println(attribute);
		driver.quit();
	   
	}




}
