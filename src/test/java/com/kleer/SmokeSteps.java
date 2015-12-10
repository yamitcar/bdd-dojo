package com.kleer;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import com.gargoylesoftware.htmlunit.BrowserVersion;
import cucumber.api.java.After;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;


public class SmokeSteps {
    
    static WebDriver driver;

    {   
        //Config for a ChromeDriver
       // System.setProperty("webdriver.chrome.driver", "/Users/yamitcardenas/desarrollo/tools/chromedriver");
        //driver = new ChromeDriver();
        
        //config for a headless browser with HtmlUnit
        driver = new HtmlUnitDriver(BrowserVersion.CHROME);
        ((HtmlUnitDriver)driver).setJavascriptEnabled(true);
        

        WebDriverRunner.setWebDriver(driver);
    }

    @After
    public void tearDown(){
        driver.close();
    }


    @Dado("^ingreso a la libreria$")
    public void ingreso_al_juego() throws Throwable {
        Selenide.open("http://localhost:4567/");
    }

    @Entonces("^veo el mensaje \"([^\"]*)\"$")
    public void veo_el_mensaje(String message) throws Throwable {
        $(By.id("welcome")).shouldHave(text(message));
    }

    @Y("^compro mi seleccion de libros$")
    public void compro_mi_seleccion_de_libros() throws Throwable {
        $(By.id("comprar")).click();
    }

    @Cuando("^selecciono (\\d+) libro de \"([^\"]*)\"$")
    public void selecciono_libro_de(int cantidad, String libro) throws Throwable {
        $(By.id(libro)).setValue(cantidad+"");
    }

    @Entonces("^veo \"([^\"]*)\"$")
    public void veo(String mensaje) throws Throwable {
        $(By.id("total")).shouldHave(text(mensaje));
    }
}
