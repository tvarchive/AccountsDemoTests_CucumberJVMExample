package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage {

    WebDriver driver;

    By firstNameTextBoxLocator = By.id("user_first_name");
    By lastNameTextBoxLocator = By.id("user_last_name");
    By emailTextBoxLocator = By.id("user_email");
    By passwordTextBoxLocator = By.id("user_password");
    By confirmPasswordTextBoxLocator = By.id("user_password_confirmation");
    By signupButtonLocator = By.name("commit");


    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }

    public void she_provides_the_first_name_as(String firstName) throws Throwable {
        driver.findElement(firstNameTextBoxLocator).sendKeys(firstName);
    }


    public void she_provides_the_last_name_as(String lastName) throws Throwable {
        driver.findElement(lastNameTextBoxLocator).sendKeys(lastName);
    }

    public void she_provides_the_email_as(String email) throws Throwable {
        driver.findElement(emailTextBoxLocator).sendKeys(email);
    }

    public void she_provides_the_password_as(String password) throws Throwable {
        driver.findElement(passwordTextBoxLocator).sendKeys(password);
    }

    public void she_provides_the_confirm_password_again_as(String confirmPassword) throws Throwable {
        driver.findElement(confirmPasswordTextBoxLocator).sendKeys(confirmPassword);
    }


    public void she_signs_up() throws Throwable {
        driver.findElement(signupButtonLocator).click();
    }
}
