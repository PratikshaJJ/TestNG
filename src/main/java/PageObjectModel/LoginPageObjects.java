package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	public WebDriver driver;
	
	By Username = By.xpath("//input[@id='username']");
	By Password = By.xpath("//input[@id='password']");
	By Login = By.xpath("//input[@id='Login']");
	
	public LoginPageObjects(WebDriver driver2) {
		// TODO Auto-generated constructor 
this.driver=driver2;
	}
	public WebElement EnterUsername () {
		return driver.findElement(Username);
	}
public WebElement EnterPassword() {
	return driver.findElement(Password);
}
public WebElement ClickLogin () {
	return driver.findElement(Login);	
}
}
