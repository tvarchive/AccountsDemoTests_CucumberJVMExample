package pagesWithPageFactoryImplementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pagesWithPageFactoryImplementation.AccountsAppBasePage;


public class NavigationBar extends AccountsAppBasePage {


    public NavigationBar(WebDriver driver) {
        super(driver);
    }

    //    @FindBy(linkText = "Clients")
    @FindBy(xpath = "//a[contains(@href, '/clients')]")
    private WebElement clientsTab;


    public void goToClientsSection() {
        clientsTab.click();
    }
}
