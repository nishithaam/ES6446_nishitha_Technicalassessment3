package com.nishitha.teechassessment3.com.nishitha.techassessment3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginlocators {
	@FindBy(xpath ="//a[@class=\'ico-login\']")
	WebElement loginclick;
	
	@FindBy(xpath = "//input[@name='Email']")
	WebElement Email;
	
	@FindBy(xpath = "//input[@name='Password']")
	WebElement Password;

}
