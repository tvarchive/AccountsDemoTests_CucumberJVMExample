package steps;

import cucumber.api.java.en.Then;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchSteps {

    WebDriver driver = new FirefoxDriver();

    @Then("^the client should be able to search for the company ([^\"]*)$")
    public void the_client_should_be_able_to_search_for_the_company(String companyName) throws Throwable {
        driver.findElement(By.xpath("//a[contains(@href, '/clients')]"));
        driver.findElement(By.id("search")).sendKeys(companyName);
        driver.findElement(By.className("searchBth")).click();
        int resultingRowsCount = driver.findElements(By.cssSelector("table tbody tr")).size();
        Assert.assertTrue(resultingRowsCount > 0);
    }
}
