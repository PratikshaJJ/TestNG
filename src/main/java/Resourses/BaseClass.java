package Resourses;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BaseClass {
	public WebDriver driver;
public WebDriver InitialiseDriver() throws IOException {
	FileInputStream fi=new  FileInputStream("C:\\Users\\admin\\eclipse-workspace\\DemoE2E\\src\\main\\java\\Resourses\\Data.properties");
	Properties prop=new Properties();
	prop.load(fi);
	String Browsername = prop.getProperty("Browser");
	if(Browsername.equals("Chrome"))
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		  driver = new ChromeDriver(options);
	}
	else if (Browsername.equals("firefox")) {
		//firefoxcode
	}
	else if (Browsername.equals("Internetexplorer")) {
		//firefoxcode
	}
	//return driver;
	return driver;	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*public void initialiseDriver() throws IOException {
	FileInputStream fi=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\DemoE2E\\src\\main\\java\\Resourses\\Data.properties");
	Properties prop =new Properties();
	prop.load(fi);
	String Browsername = prop.getProperty("Browser");
	if (Browsername.equals("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Selenium Jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	}
	else if (Browsername.equals("firefox")) {
		//firefoxcode
	}
	else if (Browsername.equals("internerexploror")) {
        //internerexploror code
	}
	
	
	
	*/

}
