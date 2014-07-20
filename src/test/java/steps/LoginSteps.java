package steps;

import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LoginSteps {

    WebDriver driver = new FirefoxDriver();

    @When("^she logs in with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void she_logs_in_with_username_and_password(String username, String password) throws Throwable {
        driver.findElement(By.id("user_email")).sendKeys(username);
        driver.findElement(By.id("user_password")).sendKeys(password);
        driver.findElement(By.name("commit")).click();
    }
}
