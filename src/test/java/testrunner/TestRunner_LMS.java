package testrunner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utilities.ScenarioContext;

@CucumberOptions(
			plugin = {"pretty", "html:target/LMSTeam1March25Report.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, //reporting purpose
			monochrome=false, 
			tags ="@Login or @ClassModule_Getall or  @DeleteClass_CSID", 
			features = {"src/test/resources/Features/01_login.feature",
					"src/test/resources/Features/06_class2.feature"}, 
			glue= {"stepdefinitions"})
	

public class TestRunner_LMS extends AbstractTestNGCucumberTests   {
	
	public static ScenarioContext scenarioContext = new ScenarioContext();
			
	    }
	


