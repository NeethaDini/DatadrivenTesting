package Automation.OnlineBanking.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage{
	
	public WebDriver driver;
	
	public static final By select_account=By.id("listAccounts");
  
	public static final By lnk_viewAccSummary = By.xpath("//a[text()='View Account Summary']");
	
	public static final By lnk_viewResTransaction= By.xpath("//a[text()='View Recent Transactions']");
	
	public static final By lnk_transferFunds= By.xpath("//a[text()='Transfer Funds']");
	
	public static final By lnk_searchNewsArticals= By.xpath("//a[text()='Search News Articles']");
	
	public static final By lnk_customizeSiteLang= By.xpath("//a[text()='Customize Site Language']");
	
	public static final By btn_Go=By.id("btnGetAccount");
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clicklinkViewAccSummary() {
		driver.findElement(lnk_viewAccSummary).click();
	}
	
	public void clicklinkViewRecentTrans() {
		driver.findElement(lnk_viewResTransaction).click();
	}
	
	public void clicklinkTransferFunds() {
		driver.findElement(lnk_transferFunds).click();
	}
	
	public void clicklinksearchNewsArticals() {
		driver.findElement(lnk_searchNewsArticals).click();
	}
	
	public void clicklinkcustomizeSiteLang() {
		driver.findElement(lnk_customizeSiteLang).click();
	}
	
	public void drpdownViewAccDetails(String accountNumber) {
		WebElement ele=driver.findElement(select_account);
		Select sel=new Select(ele);
		sel.selectByVisibleText(accountNumber);
	}
	
	public void clickbtnGo() {
		driver.findElement(btn_Go).click();
	}
	
	public String getTitle() {
		String title=driver.getTitle();
		return title;
	}
}
