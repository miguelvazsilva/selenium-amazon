package com.miguelvazsilva.selenium.amazon.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	public void logInTheForm(WebDriver driver) {
		
		String email = "youremail@provider.com";
		String pw = "yourpw";
		
        	driver.findElement(By.id("ap_email")).sendKeys(email);     
        	driver.findElement(By.id("ap_password")).sendKeys(pw);       
        	driver.findElement(By.id("signInSubmit")).click();
        
	}
    
}