package edu;


import com.codeborne.selenide.Selenide;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class templateSteps {


    @Given("^I open the app$")
    public void i_open_the_app() throws Throwable {
        Selenide.open("http://localhost:4567/");
    }

    @When("^I click on \"([^\"]*)\"$")
    public void i_click_on(String linkId) throws Throwable {
        $(By.id(linkId)).click();
    }

    @When("^I fill \"([^\"]*)\" with \"([^\"]*)\"$")
    public void i_click_on(String field, String value) throws Throwable {
        $(By.id(field)).setValue(value);
    }

    @Then("^I_should_see \"([^\"]*)\"$")
    public void veo_el_mensaje(String message) throws Throwable {
        $(By.id("welcome")).shouldHave(text(message));
    }


}
