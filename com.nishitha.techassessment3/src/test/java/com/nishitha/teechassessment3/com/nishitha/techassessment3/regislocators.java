package com.nishitha.teechassessment3.com.nishitha.techassessment3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class regislocators {
	@FindBy(xpath ="//a[@class='ico-register']")
	WebElement registerclick;
	
	@FindBy(xpath = "//input[@id='gender-female']")
	WebElement radiofemaleclick;
	
	@FindBy(xpath = "//input[@name='FirstName']")
	WebElement FirstName;
	
	@FindBy(xpath = "//input[@name='LastName']")
	WebElement LastName;
	
	@FindBy(xpath = "//input[@id='Email']")
	WebElement Email;
	
	@FindBy(xpath = "//input[@id='Password']")
	WebElement Password;
	
	@FindBy(xpath = "//input[@id='ConfirmPassword']")
	WebElement ConfirmPassword;
	
	@FindBy(xpath = "//input[@id='register-button']")
	WebElement registerButton;
 

	
	

}



