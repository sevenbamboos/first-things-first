package step;

import cucumber.api.PendingException;
import cucumber.api.java8.En;

public class AllSteps implements En {

    public AllSteps() {
        Given("^a new event$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        When("^ask for the next schedule$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });

        Then("^it should be today$", () -> {
            // Write code here that turns the phrase above into concrete actions
            throw new PendingException();
        });
    }
}
