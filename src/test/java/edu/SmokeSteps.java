package edu;

import com.codeborne.selenide.Selenide;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;


public class SmokeSteps {

    @Given("^ingreso al juego$")
    public void ingreso_al_juego() throws Throwable {
        Selenide.open("http://localhost:4567/");
    }

    @Then("^veo el mensaje \"([^\"]*)\"$")
    public void veo_el_mensaje(String message) throws Throwable {
        $(By.id("welcome")).shouldHave(text(message));
    }

    @Given("^ingreso a la tienda virtual$")
    public void ingreso_a_la_tienda_virtual() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @When("^ingrese mi usuario \"([^\"]*)\" y mi password \"([^\"]*)\"$")
    public void ingrese_mi_usuario_y_mi_password(String arg1, String arg2) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @And("^hago login$")
    public void hago_login() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Then("^debo ver \"([^\"]*)\"$")
    public void debo_ver(String message) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }
}
