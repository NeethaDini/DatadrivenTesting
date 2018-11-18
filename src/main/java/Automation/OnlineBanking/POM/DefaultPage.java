package Automation.OnlineBanking.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DefaultPage {
	
	public WebDriver driver;
  
	public static final By lnk_SignIn= By.xpath("//a[text()='Sign In']");
	public static final By logo_AltoroMutual=By.xpath("//img[@src='images/logo.gif']");
	public static final By lnk_OnlineBankingwithFreeOnlinePay = By.xpath("//a[text()='Online Banking with FREE Online Bill Pay ']");
	public static final By lnk_RealEstateFinancing=By.xpath("/a[text()='Real Estate Financing']");
	public static final By lnk_BusinessCreditCards=By.xpath("//a[text()='Business Credit Cards']");
	public static final By lnk_ContactUs=By.id("_ctl0__ctl0_HyperLink3");
	
	public DefaultPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public boolean logoDisplayed() {
		boolean logoisDisplayed=driver.findElement(logo_AltoroMutual).isDisplayed();
		return logoisDisplayed;
	}
	
	public boolean signlinkDisplayed() {
		boolean signinDisplayed=driver.findElement(lnk_SignIn).isDisplayed();
		return signinDisplayed;
	}
	
	public boolean contactUslinkDisplayed() {
		boolean contactUsDisplayed=driver.findElement(lnk_ContactUs).isDisplayed();
		return contactUsDisplayed;
	}
	
	public String getDefaultPageTitle() {
		String title=driver.getTitle();
		System.out.println(title);
		return title;
	}
	
	public String getDefaultPageUrl() {
		String url=driver.getCurrentUrl();
		System.out.println(url);
		return url;
	}
}
