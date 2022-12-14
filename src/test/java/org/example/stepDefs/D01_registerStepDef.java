package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D01_registerStepDef {
    P01_Register register = new P01_Register();
    @Given("user go to register page")
    public void registerPage()
    {
        register.registerLink().click();
    }
    @When("user select gender type")
    public void gender()
    {
    register.genderType().click();
    }
    @And("user enter first name \"Abdelrahman\"")
    public void firstname()
    {
    register.firstName().sendKeys("Abdelrahman");
    }
    @And("user enter last name \"Mahmoud\"")
    public void lastname()
    {
        register.lastName().sendKeys("Mahmoud");
    }
    @And("user enter date of birthday")
    public void dateOfBirthDay()
    {
        Select select = new Select(register.day());
        select.selectByIndex(6);
        select = new Select(register.month());
        select.selectByVisibleText("September");
        select = new Select(register.year());
        select.selectByVisibleText("1993");

    }
    @And("user enter email \"test@example.com\" field")
    public void enterEmail()
    {
     register.enterEmail().sendKeys("bedomahmoud125@gmail.com");
    }
    @And("user fills Password fields")
    public void enterPassword()
    {
     register.enterPassword().sendKeys("pass123456");
    }
    @And("user fills confirm Password fields")
    public void confirmPassword()
    {
     register.confirmPassword().sendKeys("pass123456");
    }
   @And("user clicks on register button")
    public void clickButton()
   {
   register.clickButton().click();
   }

  @And("user register successfully")
    public void isSuccessMessageDisplayed()
  {
      register.isSuccessMessageDisplayed().isDisplayed();

  }

}
