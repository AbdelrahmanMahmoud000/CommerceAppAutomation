package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {

     public static WebDriver driver = null;




    @Before
    public static void openBrowser()
    {
        //1-Bridge
  System.setProperty("webdriver.chrome.driver" , "E:\\FDW\\webinar\\automation pro\\chromedriver.exe");

       //2- Create new object from chromeDriver
        driver = new ChromeDriver();

        //3- Configuration
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10 , TimeUnit.SECONDS);

        //4- Navigate to web site
        driver.navigate().to("https://demo.nopcommerce.com/");

    }


    @After
    public static void quitDriver() throws InterruptedException {
       Thread.sleep(5000);
    driver.quit();
    }
}
