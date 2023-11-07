package com.nishitha.teechassessment3.com.nishitha.techassessment3;

import org.openqa.selenium.support.PageFactory;

public class RegisterPageActions {
	regislocators log = new regislocators();
	RegisterPageActions registerpageactions;
	//String strfirstname, strLastName,strPassword,strConfirmPassword;   //read it from external file and store it here

	public RegisterPageActions() {  
		this.registerpageactions = new RegisterPageActions();
		
		PageFactory.initElements(HelperClass.getDriver(), log);
	}
	
	
	public void setFirst(String strfirstname) {
		log.FirstName.sendKeys(strfirstname);
	}
	public void setLastName(String strLastName) {
		log.LastName.sendKeys(strLastName);
	}

	public void setPassword(String strPassword) {
		log.Password.sendKeys(strPassword);
	}
	public void setRepeatedPassword(String strConfirmPassword) {
		log.ConfirmPassword.sendKeys(strConfirmPassword);
	}
	
	
	public void name(String strFirstName, String strLastName) {
		setFirst(strFirstName);
		setLastName(strLastName);
	}
	
	
	public void user( String strPassword, String strConfirmPassword) {
	
		setPassword(strPassword);
		setRepeatedPassword(strConfirmPassword);
	}

	

		
	
	
}
 
	



