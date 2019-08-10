package page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertEquals;

public class AssertEmail {
	static WebDriver driver;
	
	public AssertEmail(WebDriver driver) {
		AssertEmail.driver = driver;
	}
	
	//method to validate email
	public void verifyEmail() {
		WebElement email = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div/div[1]/div[2]/table/tbody/tr[1]/td[5]"));
		assertEquals("teste@teste.com", email.getText() );
	}
}
