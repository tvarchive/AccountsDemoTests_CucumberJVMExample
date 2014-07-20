package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {

    WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
    }


    public void she_chooses_to_sign_up() throws Throwable {
        driver.findElement(By.linkText("Sign up")).click();
    }
}
