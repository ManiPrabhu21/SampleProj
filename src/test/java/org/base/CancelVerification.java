package org.base;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelVerification extends BaseClas {
	
	public CancelVerification() {
		PageFactory.initElements(driver, this);
	}
	
@FindBy(id="search_result_error")
 private WebElement txtmsg;

public WebElement getTxtmsg() {
	return txtmsg;
}
public String canceVerification() {

	String text = text(getTxtmsg());
	return text;
}

}
