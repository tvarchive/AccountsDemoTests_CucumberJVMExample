package pagesWithPageFactoryImplementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pagesWithPageFactoryImplementation.AccountsAppBasePage;
import steps.ClientSteps;

public class ClientsPage extends AccountsAppBasePage {

    public ClientsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(text(),'+ Add New Client')]")
    private WebElement addNewClientLink;

    @FindBy(id = "client_company_name")
    private WebElement companyNameInput;

    @FindBy(id = "client_contact_person_name")
    private WebElement contactPersonNameInput;

    @FindBy(id = "client_address")
    private WebElement addressInput;

    @FindBy(id = "client_phone_number")
    private WebElement phoneNumberInput;

    @FindBy(id = "client_email")
    private WebElement emailInput;

    @FindBy(name = "commit")
    private WebElement createClientButton;

    public void chooseToAddANewClient() {
        waitUntil(ExpectedConditions.elementToBeClickable(addNewClientLink));
        addNewClientLink.click();
    }

    public void addNewClientWithDetails(ClientSteps.ClientDetails newClient) {
        companyNameInput.sendKeys(newClient.companyName);
        contactPersonNameInput.sendKeys(newClient.contactPersonName);
        addressInput.sendKeys(newClient.address);
        phoneNumberInput.sendKeys(newClient.phoneNumber);
        emailInput.sendKeys(newClient.email);
        createClientButton.click();
    }
}
