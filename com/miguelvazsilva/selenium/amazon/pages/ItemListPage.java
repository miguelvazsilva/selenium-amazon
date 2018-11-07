package com.miguelvazsilva.selenium.amazon.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemListPage {
	
	public void clickItem(WebDriver driver) {
		
        	driver.findElement(By.xpath("//*[@id=\"result_0\"]/div/div[3]/div[1]/a")).click();
        
	}
    
}