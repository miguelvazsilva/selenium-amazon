package com.miguelvazsilva.selenium.amazon.wishlist;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.miguelvazsilva.selenium.amazon.pages.*;

public class AmazonWishList {

	static WebDriver driver;
	
	public void openbrowser(String url){

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\ChromeDriver\\chromedriver.exe");
        
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,  TimeUnit.SECONDS);
		
		driver.get(url);

 	}
 
	public static void main(String[] args){

		AmazonWishList amazonwishlist1 = new AmazonWishList();
    	
		amazonwishlist1.openbrowser("https://www.amazon.com/");

		HomePage homepage1 = new HomePage();
    	homepage1.clickLogin(driver);

		LoginPage loginpage1 = new LoginPage();
		loginpage1.logInTheForm(driver);
    			
		homepage1.searchItem(driver);
    	
		ItemListPage itemlistpage1 = new ItemListPage();	
		itemlistpage1.clickItem(driver);
     	
		ItemPage itempage1 = new ItemPage();	
		itempage1.addToWishlist(driver);
    	
		AmazonWishList.driver.quit();

	}

}