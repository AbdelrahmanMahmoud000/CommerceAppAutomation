package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_homePage {

    public WebElement currencyList()
    {
        WebElement currencyList = Hooks.driver.findElement(By.id("customerCurrency"));
        return currencyList;

    }
    public List<WebElement> prices()
    {
        List<WebElement> Prices = Hooks.driver.findElements(By.cssSelector("span[class='price actual-price']"));
        return prices();
    }

}
