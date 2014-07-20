package steps;


import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import gherkin.formatter.model.DataTableRow;
import pagesWithPageFactoryImplementation.SignupPage;

import java.util.List;

public class SignUpPageSteps extends DriverFactory {


    @And("^she provides the first name as ([^\"]*)$")
    public void she_provides_the_first_name_as(String firstName) throws Throwable {
        new SignupPage(driver).she_provides_the_first_name_as(firstName);
    }


    @And("^she provides the last name as ([^\"]*)$")
    public void she_provides_the_last_name_as(String lastName) throws Throwable {
        new SignupPage(driver).she_provides_the_last_name_as(lastName);
    }

    @And("^she provides the email as ([^\"]*)$")
    public void she_provides_the_email_as(String email) throws Throwable {
        new SignupPage(driver).she_provides_the_email_as(email);
    }

    @And("^she provides the password as ([^\"]*)$")
    public void she_provides_the_password_as(String password) throws Throwable {
        new SignupPage(driver).she_provides_the_password_as(password);
    }

    @And("^she provides the confirm password again as ([^\"]*)$")
    public void she_provides_the_confirm_password_again_as(String confirmPassword) throws Throwable {
        new SignupPage(driver).she_provides_the_confirm_password_again_as(confirmPassword);
    }


    @And("^she signs-up$")
    public void she_signs_up() throws Throwable {
        new SignupPage(driver).she_signs_up();
    }

    @And("^she provides the her details as follows:$")
    public void she_provides_the_her_details_as_follows(List<UserDetails> users) throws Throwable {
        UserDetails userToBeSignedUp = users.get(0);

        new SignupPage(driver).she_provides_the_first_name_as(userToBeSignedUp.firstName);
        new SignupPage(driver).she_provides_the_last_name_as(userToBeSignedUp.lastName);
        new SignupPage(driver).she_provides_the_email_as(userToBeSignedUp.email);
        new SignupPage(driver).she_provides_the_password_as(userToBeSignedUp.password);
        new SignupPage(driver).she_provides_the_confirm_password_again_as(userToBeSignedUp.password);

    }

    private class UserDetails {
        public String firstName;
        public String lastName;
        public String email;
        public String password;
    }
}
