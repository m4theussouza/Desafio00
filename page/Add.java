package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Add {
	static WebDriver driver;
	//
	public Add(WebDriver driver) {
		Add.driver = driver;
	}
	
	//method to click add button
	public void clickAdd() {
		WebElement addBtt = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/form/button"));
		addBtt.click();
	}
}
