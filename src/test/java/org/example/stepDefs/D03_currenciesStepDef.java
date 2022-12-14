package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.sql.SQLOutput;
import java.util.List;


public class D03_currenciesStepDef {
    P03_homePage home  = new P03_homePage();

    @When("user select euro")
    public void selectEuro()
    {
        Select select = new Select(home.currencyList());
        select.selectByVisibleText("Euro");
    }

    @Then("euro symbol will displayed on products")
    public void euroSymbolWillDisplayedOnProducts()
    {
    for (int i=0 ; i< home.prices().size() ; i++){

       String actualResults = home.prices().get(i).getText();

        String expectResults = "€";
        Assert.assertTrue(actualResults.contains(expectResults));
    }

    }
}
