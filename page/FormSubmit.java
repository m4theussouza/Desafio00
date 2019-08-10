package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FormSubmit {
	static WebDriver driver;
	
	public FormSubmit(WebDriver driver) {
		FormSubmit.driver = driver;
	}
	
	//method to fill in required fields
	public void fillForm() {
		WebElement firstName = driver.findElement(By.name("fname"));
		firstName.sendKeys("Nome");
		
		WebElement lastName = driver.findElement(By.name("lname"));
		lastName.sendKeys("Sobrenome");
		
		WebElement email = driver.findElement(By.name("email"));
		email.sendKeys("teste@teste.com");
		
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("password");
		
		Select dropDown = new Select(driver.findElement(By.name("country")));
		dropDown.selectByVisibleText("Brazil");
	}
	
	//method to submit form
	public void submit() {
		WebElement submit = driver.findElement(By.name("fname"));
		submit.submit();
	}
}
