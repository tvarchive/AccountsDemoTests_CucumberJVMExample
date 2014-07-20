package pagesWithPageFactoryImplementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created with IntelliJ IDEA.
 * User: Sukeshk
 * Date: 11/06/14
 * Time: 11:30 AM
 * To change this template use File | Settings | File Templates.
 */
public class AccountsAppBasePage {

    WebDriver driver;

    public AccountsAppBasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void waitUntil(ExpectedCondition<WebElement> expectedCondition){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(expectedCondition);
    }
}
