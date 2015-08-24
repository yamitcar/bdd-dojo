#Project Base for TDD and ATDD with java

It use Spark microframework, Cucumber, Junit, HtmlUnit and Selenide.

This Project was configured with a headless browser using HtmlUnitDriver (Selenium)

###If you want to config this to run with Google Chrome you need to follow the next instructions:

First you need to config the Chrome Driver

    download it from: https://sites.google.com/a/chromium.org/chromedriver/downloads


In  file `/src/test/java/edu/SmokeSteps.java` enable this lines:
    
    System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
    driver = new ChromeDriver();

and remove this lines:

    driver = new HtmlUnitDriver();
    ((HtmlUnitDriver)driver).setJavascriptEnabled(true);


##config with Junit and Cucumber-JVM

to run the test:

    gradle clean test --info

to generate coverage report:

    gradle clean test jacocoTestReport --info

