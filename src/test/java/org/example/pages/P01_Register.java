package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_Register {



    public WebElement registerLink()
    {
        WebElement reg = Hooks.driver.findElement(By.className("ico-register"));
        return reg ;

    }
    public WebElement genderType()
    {
        WebElement gender = Hooks.driver.findElement(By.id("gender-male"));
        return gender;

    }
    public WebElement firstName()
    {
        WebElement firstName = Hooks.driver.findElement(By.id("FirstName"));
        return firstName;

    }
    public WebElement lastName()
    {
        WebElement lastName = Hooks.driver.findElement(By.id("LastName"));
        return lastName;

    }
    public WebElement day()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthDay"));

    }
    public WebElement month()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));

    }
    public WebElement year()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthYear"));

    }
    public WebElement enterEmail()
    {
        WebElement enterEmail = Hooks.driver.findElement(By.id("Email"));
        return enterEmail;

    }
    public WebElement enterPassword()
    {
        WebElement enterPassword = Hooks.driver.findElement(By.id("Password"));
        return enterPassword;

    }
    public WebElement confirmPassword()
    {
        WebElement confirmPassword = Hooks.driver.findElement(By.cssSelector("input[id='ConfirmPassword']"));
        return confirmPassword;

    }
    public WebElement clickButton()
    {
        WebElement clickButton = Hooks.driver.findElement(By.cssSelector("button[name='register-button']"));
        return clickButton;

    }
    public WebElement isSuccessMessageDisplayed()
    {
     WebElement successMessage = Hooks.driver.findElement(By.cssSelector("div[class='result']"));
      return successMessage;
    }


}
