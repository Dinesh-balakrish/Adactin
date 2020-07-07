package com.testrunnerclass;

import org.junit.runner.RunWith; 

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources"}, glue= {"com.stepdefinitionclass"}, monochrome= true, dryRun=false )

public class RunnerClass {
	
	

}