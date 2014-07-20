package pagesWithPageFactoryImplementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created with IntelliJ IDEA.
 * User: Sukeshk
 * Date: 04/07/14
 * Time: 1:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class HomePage {


    WebDriver driver;

    @FindBy(css = "a[href='/users/sign_out']")
    private WebElement signOutLink;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean isSignOutLinkDisplayed() throws Throwable {
        return signOutLink.isDisplayed();
    }


}
