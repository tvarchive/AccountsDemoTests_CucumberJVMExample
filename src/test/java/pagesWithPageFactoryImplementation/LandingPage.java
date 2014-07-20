package pagesWithPageFactoryImplementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LandingPage  {

    WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "user_email")
    private WebElement emailInput;

    @FindBy(id = "user_password")
    private WebElement passwordInput;

    @FindBy(name = "commit")
    private WebElement signInButton;

    @FindBy (linkText = "Sign up")
    private WebElement signUpButton;

    public void loginWith(String username, String password) {
        emailInput.sendKeys(username);
        passwordInput.sendKeys(password);
        signInButton.click();
    }


    public void she_chooses_to_sign_up() throws Throwable {
        signUpButton.click();
    }

}
