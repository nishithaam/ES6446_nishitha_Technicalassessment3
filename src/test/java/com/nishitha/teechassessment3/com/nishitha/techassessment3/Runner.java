package com.nishitha.teechassessment3.com.nishitha.techassessment3; 
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
 
@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\namurthy\\assessment3\\com.nishitha.techassessment3\\src\\test\\resources\\feature\\login.feature", glue = "com.nishitha.techassessment3", plugin = {"com.aventstack.extentreports.cucumber.adaptor.ExtentCucumberAdapter:"})
 

public class Runner {

}
