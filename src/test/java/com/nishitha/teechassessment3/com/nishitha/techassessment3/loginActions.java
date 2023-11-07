package com.nishitha.teechassessment3.com.nishitha.techassessment3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class loginActions {
	loginlocators log = new loginlocators();
	loginActions objloginLoc;
	
	public loginActions() {
		objloginLoc = new loginActions();
		PageFactory.initElements(HelperClass.getDriver(), objloginLoc);
	}
	public void setUsername(String Email) {
		log.Email.sendKeys(Email);
		
	}
	
	public void setPassword(String Password) {
		log.Password.sendKeys(Password);
	}
	
	public void clickLoginBtn() {
		log.loginclick.click();
	}
	
	public void loginDetails(String Email,String Password) {
		setUsername(Email);
		setPassword(Password);
	}
 
 
}