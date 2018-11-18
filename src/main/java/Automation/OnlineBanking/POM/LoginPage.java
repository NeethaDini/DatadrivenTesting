package Automation.OnlineBanking.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage{
    public WebDriver driver;
	public static final By txt_userName=By.id("uid");
	public static final By txt_password=By.id("passw");
	public static final By btn_login=By.name("btnSubmit");
	public static final By lnk_OnlineBankingLogin=By.xpath("//a[text()='ONLINE BANKING LOGIN']");
	public static final By lnk_Personal=By.xpath("//a[text()='PERSONAL']");
	public static final By lnk_SmallBusiness=By.xpath("//a[text()='SMALL BUSINESS']");
	public static final By lnk_InsideAltoroMutual=By.xpath("//a[text()='INSIDE ALTORO MUTUAL']");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterUserName(String name) {
		driver.findElement(txt_userName).sendKeys(name);
	}
	
	public void enterPassword(String pass) {
		driver.findElement(txt_password).sendKeys(pass);
	}
	
	public void clickLogin() {
		driver.findElement(btn_login).click();
	}
	
	public boolean isOnlineBankingdisplayed() {
		boolean isDisplayed=driver.findElement(lnk_OnlineBankingLogin).isDisplayed();
		return isDisplayed;
	}
	
	public boolean isPersonaldisplayed() {
		boolean isDisplayed=driver.findElement(lnk_Personal).isDisplayed();
		return isDisplayed;
	}
	
	public boolean isSmallBusinessdisplayed() {
		boolean isDisplayed=driver.findElement(lnk_SmallBusiness).isDisplayed();
		return isDisplayed;
	}
	
	public boolean isInsideAltoroMutualdisplayed() {
		boolean isDisplayed=driver.findElement(lnk_InsideAltoroMutual).isDisplayed();
		return isDisplayed;
	}
	
	public void login(String userName, String password) {
		driver.findElement(txt_userName).clear();
		driver.findElement(txt_userName).sendKeys(userName);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
	}
}
