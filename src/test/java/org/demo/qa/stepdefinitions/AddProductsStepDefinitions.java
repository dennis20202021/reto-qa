package org.demo.qa.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.demo.qa.question.PageTitle;
import org.demo.qa.task.AddProducts;
import org.demo.qa.task.NavigateTo;

public class AddProductsStepDefinitions {

    private final Actor currentActor = OnStage.theActorInTheSpotlight();

    @Given("{actor} navigates to the San Angel website")
    public void danielNavigatesToTheSanAngelWebsite(Actor actor) {
        actor.wasAbleTo(
                NavigateTo.sanAngelWebsite()
        );
    }

    @When("Add {int} product with {int} quantities to the shopping cart")
    public void addProductWithQuantitiesToTheShoppingCart(int product, int quantity) {
        currentActor.attemptsTo(
                AddProducts.withQuantity(product, quantity)
        );
    }

    @Then("Validate the page title is {string}")
    public void validateThePageTitleIs(String expectedTitle) {
        String actualTitle = currentActor.asksFor(PageTitle.is());
        currentActor.attemptsTo(
                Ensure.that(actualTitle).isEqualTo(expectedTitle)
        );
    }

}
