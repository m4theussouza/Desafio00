package test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.Add;
import page.AssertEmail;
import page.FormSubmit;
import page.Login;
import page.Navigate;

public class testRegistration {

	static WebDriver driver;
	static Login login;
	static Navigate navigate;
	static Add button;
	static FormSubmit form;
	static AssertEmail email;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/admin/");
		login = new Login(driver);
		navigate = new Navigate(driver);
		button  = new Add(driver);
		form = new FormSubmit(driver);
		email = new AssertEmail(driver);
	}
	
	//
	@Test
	public void test() throws InterruptedException {
		login.fillFields();
		login.touchLoginBtt();
		Thread.sleep(2000);
		navigate.navigate();
		button.clickAdd();
		form.fillForm();
		form.submit();
		email.verifyEmail();
	}

	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	//	driver.close();
	}	

}
