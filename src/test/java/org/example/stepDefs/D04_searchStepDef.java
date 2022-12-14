package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P04_searchPage;

public class D04_searchStepDef {
 P04_searchPage search = new P04_searchPage();

 @When("user click on search field")
 public void searchItem()
 {
search.searchItem().click();
 }


 @Given("user enter this value {string}")
 public void userEnterThisValue(String arg0) {
 }


 @And("user enter product name")
 public void userEnterProductName()
 {
  search.productName().sendKeys("book");
 }

 @Then("user click on search button")
 public void userClickOnSearchButton()
 {
  search.searchbutton().click();
 }
}
