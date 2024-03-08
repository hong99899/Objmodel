package com.group.maven_archetype_java;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {
		  WebDriver driver;
		  By usernameInput = By.name("username");
		  By passwordInput = By.name("password");
		  By loginButton = By.tagName("button");

		  public LoginPage(WebDriver driver) {
		      this.driver = driver;
		  }
		  public void enterUsername(String username) {
		      driver.findElement(usernameInput).sendKeys(username);
		  }
		  public void enterPassword(String password) {
		      driver.findElement(passwordInput).sendKeys(password);
		  }
		  public void clickLoginButton() {
		      driver.findElement(loginButton).click();
		}
}
