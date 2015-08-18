package edu;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;


public class SmokeSteps {

    {
        System.setProperty("webdriver.chrome.driver", "E:\\desarrollo\\herramientas\\chromedriver.exe");
        WebDriverRunner.setWebDriver(new ChromeDriver());
    }

    @Given("^ingreso al juego$")
    public void ingreso_al_juego() throws Throwable {
        Selenide.open("http://localhost:4567/");
    }

    @Then("^veo el mensaje \"([^\"]*)\"$")
    public void veo_el_mensaje(String message) throws Throwable {
        $(By.id("welcome")).shouldHave(text(message));
    }
}
