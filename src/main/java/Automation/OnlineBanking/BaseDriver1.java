package Automation.OnlineBanking;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseDriver1  {

	public static WebDriver driver;
	
	public WebDriver getDriver() throws IOException {
		FileReader f1= new FileReader("C:\\Users\\dheen\\TestingWorkspace\\Selenium\\src\\seleniumwebdriver\\SeleniumWebDriver.properties"
				+ "");
		BufferedReader reader= new BufferedReader(f1);
		Properties p= new Properties();
		p.load(reader);
		
		String strBrowser=p.getProperty("browser");
		if(strBrowser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", p.getProperty("IEDriverPath"));
			driver= new InternetExplorerDriver();
		}
		else if(strBrowser.equalsIgnoreCase("CHROME")) {
			System.setProperty("webdriver.chrome.driver", p.getProperty("ChromedriverPath"));
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			driver= new ChromeDriver(options);
		}
		else if(strBrowser.equalsIgnoreCase("FIREFOX"))
		{
			System.setProperty("webdriver.gecko.driver", p.getProperty("FirefoxDriverPath"));
			driver= new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		return driver;
		
	}

}
