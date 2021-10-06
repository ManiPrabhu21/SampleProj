package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClas{
	
	public Login() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy(id = "username")
	private WebElement TxtSearch;

	@FindBy(id = "password")
	private WebElement txtPass;

	@FindBy(id = "login")
	private WebElement btnlogin;

	public WebElement getTxtSearch() {
		return TxtSearch;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
	public void login(String Username,String Password) {
		passtxt(getTxtSearch(), Username);
		passtxt(getTxtPass(), Password);
		click(getBtnlogin());
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
	
	
	


