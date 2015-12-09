package com.kleer;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.After;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;


public class SmokeSteps {
    
    static WebDriver driver;

    {   
        //Config for a ChromeDriver
        System.setProperty("webdriver.chrome.driver", "/Users/yamitcardenas/desarrollo/tools/chromedriver");
        driver = new ChromeDriver();
        
        //config for a headless browser with HtmlUnit
        //driver = new HtmlUnitDriver();
        //((HtmlUnitDriver)driver).setJavascriptEnabled(true);
        //WebDriverRunner.setWebDriver(driver);
    }

    @Dado("^ingreso al juego$")
    public void ingreso_al_juego() throws Throwable {
        Selenide.open("http://localhost:4567/");
    }

    @Entonces("^veo el mensaje \"([^\"]*)\"$")
    public void veo_el_mensaje(String message) throws Throwable {
        $(By.id("welcome")).shouldHave(text(message));
    }

    @After
    public void tearDown(){
        driver.close();
    }
}
