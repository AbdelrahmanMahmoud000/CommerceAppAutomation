package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P02_login;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
    P02_login login = new P02_login();
@Given("the user open login page")
    public void loginPage()
{
    login.loginPageLink().click();
}
@And("user enter valid email")
    public void enterEmail()
{
    login.enterEmail().sendKeys("bedomahmoud125@gmail.com");
}
    @And("user enter valid password")
    public void enterPass()
    {
        login.enterPass().sendKeys("pass123456");
    }

@And("user click on login button")
    public  void clickButton()
{
  login.clickButton().click();
}
@Then("user login successfully")
    public void successLogin()
{
    Assert.assertEquals("https://demo.nopcommerce.com/" , login.successLogin());
}









}
