package TestCases;
///new changes
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjects;
import Resourses.BaseClass;

public class TC1verifylogin extends BaseClass {
	@Test(dataProvider = "Login")
public void LaunchBrowser (String Username, String Password) throws IOException, InterruptedException {
	driver = InitialiseDriver(); 
driver.get("https://login.salesforce.com/");
String a = driver.getTitle();
System.out.println(a);


LoginPageObjects obj=new LoginPageObjects(driver);
obj.EnterUsername().sendKeys(Username);
obj.EnterPassword().sendKeys(Password);
obj.ClickLogin().click();

}
	
	@DataProvider
	Object[][] Login (){
	Object[][] a=new Object [2][2];
	a[0][0]="Pratiksha@gmail.com";
	a[0][1]="Pratiksha@123";
	a[1][0]="Pratiksha123@gmail.com";
	a[1][1]="Pratiksha@444";
	return a;
	
	}
	
}


