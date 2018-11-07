package com.miguelvazsilva.selenium.amazon.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	public void clickLogin(WebDriver driver) {
				
    		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
    	
	}

	public void searchItem(WebDriver driver) {
		
        	driver.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]/option[7]")).click();
        	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("macBook Air");
        	driver.findElement(By.className("nav-input")).click();
        
	}
    	
}