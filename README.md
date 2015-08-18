Project Base for TDD and ATDD with java

It use Spark microframework, Cucumber, Junit and Selenide.

First you need to config the Chrome Driver

    download it from: https://sites.google.com/a/chromium.org/chromedriver/downloads

and set the path with:

    System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");


config with Junit and Cucumber-JVM

to run the test:

    gradle clean test --info

to generate coverage report:

    gradle clean test jacocoTestReport --info

