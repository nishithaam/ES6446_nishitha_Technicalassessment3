package com.nishitha.teechassessment3.com.nishitha.techassessment3;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
 
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
public class HookClass {
	@Before
	public void setup() {
		HelperClass.setUpDriver();
	}
	@After
	public static void tearDown() {
		
		HelperClass.tearDown();
	}
}
 
 