package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ClientManagementSteps {

    WebDriver driver = new FirefoxDriver();

    @When("^she chooses to add a new client$")
    public void she_chooses_to_add_a_new_client() throws Throwable {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(@href, '/clients')]")));
        driver.findElement(By.xpath("//a[contains(@href, '/clients')]"));
        driver.findElement(By.xpath("//a[contains(text(),'+ Add New Client')]"));
    }

    @And("^she adds a new client with the following details$")
    public void she_provides_the_details_for_the_new_client(List<ClientDetails> clients) throws Throwable {
        ClientDetails newClient = clients.get(0);
        driver.findElement(By.id("client_company_name")).sendKeys(newClient.companyName);
        driver.findElement(By.id("client_contact_person_name")).sendKeys(newClient.contactPersonName);
        driver.findElement(By.id("client_address")).sendKeys(newClient.address);
        driver.findElement(By.id("client_phone_number")).sendKeys(newClient.phoneNumber);
        driver.findElement(By.id("client_email")).sendKeys(newClient.email);
        driver.findElement(By.name("commit")).click();
    }



    public class ClientDetails {
        public String companyName;
        public String contactPersonName;
        public String address;
        public String phoneNumber;
        public String email;

    }

}
