package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.AmazonPaginaPrincipal;

public class Test001Steps {
 
    AmazonPaginaPrincipal amazonPrincipal = new AmazonPaginaPrincipal();

    @Given("the user navigates to {string}")
    public void amazonNavigateTo(String url) {
        amazonPrincipal.navigateToAmazonPage(url);
    }

    @And("Searches for {string}")
    public void amazonSearchesFor(String search) {
        amazonPrincipal.searchSomething(search);
    }

    @And("navigates to the page number {string}")
    public void amazonNavigateInto(String number) {
        amazonPrincipal.goToPage(number);
    }

    @And("selects the third item")
    public void amazonSelectThe() throws InterruptedException {
        amazonPrincipal.goToResult();
    }

    @Then("assert that the item would be available for purchase")
    public void amazonAssertPurchase() {
        Assert.assertNotNull(amazonPrincipal.addToCart());
    }



}