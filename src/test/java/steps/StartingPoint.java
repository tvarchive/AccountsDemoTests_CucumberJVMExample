package steps;

import cucumber.api.java.After;
import pagesWithPageFactoryImplementation.PageStore;

/**
 * Created with IntelliJ IDEA.
 * User: Sukeshk
 * Date: 10/06/14
 * Time: 11:51 AM
 * To change this template use File | Settings | File Templates.
 */
public class StartingPoint extends BaseSteps {
//    @Given("^the user is on landing page$")
    public void setup() throws Throwable {
        pageStore = new PageStore();
        pageStore.getDriver().get("http://accountsdemo.herokuapp.com");
        pageStore.getDriver().manage().window().maximize();
    }


    @After
    public void teardown(){
//        pageStore.destroy();
    }


}
