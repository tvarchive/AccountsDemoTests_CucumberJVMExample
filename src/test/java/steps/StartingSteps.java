package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import pages.LandingPage;
import pages.SignupPage;

import java.util.List;

public class StartingSteps extends DriverFactory {


    @Given("^the user is on landing page$")
    public void setup() throws Throwable {
        driver.get("http://accountsdemo.herokuapp.com");
        driver.manage().window().maximize();
    }

    @Before
    public void beforeScenario(){
        System.out.println("this will run before the actual scenario");
    }

    @After
    public void afterScenario(){
        System.out.println("this will run after scneario is finished, even if it failed");
    }


    @Before("@Signup-DataDriven")
    public void signupSetup(){
        System.out.println("This should run everytime before any of the @Signup-DataDriven tagged scenario is going to run");
    }

    @After("@Signup-DataDriven")
    public void signupTeardown(){
        System.out.println("This should run everytime after any of the @Signup-DataDriven tagged scenario has run");
    }


}
