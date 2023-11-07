package com.nishitha.teechassessment3.com.nishitha.techassessment3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


 
public class UtilityClass {
	String strFirstName,strLastName,strPassword,strConfirmPassword;

 
	public UtilityClass() {
		data();
	}
 
	public void data() {
		File file = new File("src\\test\\resources\\feature\\regis.feature");
		FileInputStream fio = null;
		try {
			fio = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
 
		Properties prop = new Properties();
		try {
			prop.load(fio);
		} catch (IOException e) {
			e.printStackTrace();
		}
 
	
		strFirstName = prop.getProperty("FirstName");
		strLastName = prop.getProperty("LastName");
		strPassword = prop.getProperty("password");
		strConfirmPassword = prop.getProperty("ConfirmPassword");
 
}
}

