package steps;

import cucumber.api.java.en.Then;
import pagesWithPageFactoryImplementation.ClientsPage;

import java.util.List;


public class ClientSteps extends BaseSteps {

//    @And("^she adds a new client with the following details$")
    public void she_provides_the_details_for_the_new_client(List<ClientDetails> clients) throws Throwable {
        ClientDetails newClient = clients.get(0);
        pageStore.get(ClientsPage.class).addNewClientWithDetails(newClient);
    }

    @Then("^the client should be created$")
    public void the_client_should_be_created() throws Throwable {
        // Express the Regexp above with the code you wish you had
        ;
    }

    public class ClientDetails {
        public String companyName;
        public String contactPersonName;
        public String address;
        public String phoneNumber;
        public String email;

    }
}
