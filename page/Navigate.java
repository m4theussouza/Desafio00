package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Navigate {
	static WebDriver driver;
	
	public Navigate(WebDriver driver) {
		Navigate.driver = driver;
	}
	
	//method to reach customers
	public void navigate() {
		WebElement accounts = driver.findElement(By.xpath("/html/body/div[2]/nav/div[3]/ul/li[5]/a"));
		accounts.click();
		WebElement customers = driver.findElement(By.xpath("//*[@id=\"ACCOUNTS\"]/li[3]/a"));
		customers.click();
	}
}
