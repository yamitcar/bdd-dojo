package edu;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;


public class SmokeSteps {
    
    static WebDriver driver;

    {   
        //Config for a ChromeDriver
        //System.setProperty("webdriver.chrome.driver", "/Users/yamitcardenas/desarrollo/tools/chromedriver");
        //driver = new ChromeDriver();
        
        //config for a headless browser with HtmlUnit
        driver = new HtmlUnitDriver();
        ((HtmlUnitDriver)driver).setJavascriptEnabled(true);
        WebDriverRunner.setWebDriver(driver);
    }

    @Given("^open the game$")
    public void ingreso_al_juego() throws Throwable {
        Selenide.open("http://localhost:4567/");
    }

    @Then("^i want to see \"([^\"]*)\"$")
    public void veo_el_mensaje(String message) throws Throwable {
        $(By.id("welcome")).shouldHave(text(message));
    }

    @After
    public void tearDown(){
        driver.close();
    }
}
