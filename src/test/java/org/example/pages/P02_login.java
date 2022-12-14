package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P02_login {

    public WebElement loginPageLink()
    {
        WebElement log = Hooks.driver.findElement(By.className("ico-login"));
        return  log ;
    }
   public WebElement enterEmail()
   {
       WebElement email = Hooks.driver.findElement(By.id("Email"));
       return  email;
   }
    public WebElement enterPass()
    {
        WebElement password = Hooks.driver.findElement(By.id("Password"));
        return  password;
    }
    public WebElement clickButton()
    {
        WebElement clickButton = Hooks.driver.findElement(By.cssSelector("button[class='button-1 login-button']"));
        return clickButton;

    }
    public String successLogin()
    {
        String successLogin = Hooks.driver.getCurrentUrl();
        return successLogin ;
    }







}
