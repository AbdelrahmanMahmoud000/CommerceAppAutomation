package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P04_searchPage {


    public WebElement searchItem() {
        WebElement search = Hooks.driver.findElement(By.cssSelector("input[class='search-box-text ui-autocomplete-input']"));
        return search;

    }

    public WebElement productName() {
        WebElement productName = Hooks.driver.findElement(By.cssSelector("input[class='search-box-text ui-autocomplete-input']"));
        return productName;

    }
    public WebElement searchbutton()
    {
        WebElement button = Hooks.driver.findElement(By.cssSelector("button[type='submit']"));
        return button;

    }
}