package page;

//necessary imports 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//class to fill in login fields
public class Login {
	static WebDriver driver;
	
	public Login(WebDriver driver) {
		Login.driver = driver;
	}
	
	//method to access fields and fill them
	public void fillFields() {
		WebElement email = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.name("password"));
		
		email.sendKeys("admin@phptravels.com");
		password.sendKeys("demoadmin");
	}
	
	//method to click button login
	public void touchLoginBtt() {
		WebElement bttLogin = driver.findElement(By.className("ladda-label"));
		bttLogin.click();
	}
}
