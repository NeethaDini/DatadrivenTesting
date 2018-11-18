package Automation.OnlineBanking.POM;




import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountHistory {
	
	public WebDriver driver;
	
	public static final By label_accountnumber=By.xpath("//span[@id='_ctl0__ctl0_Content_Main_accountid']");
	public static final By table_balancedetail=By.xpath("//table//tbody//tr//tbody/tr[1]");
	public static final By table_credits=By.xpath("//div[@class='fl']/table/tbody/tr[2]");
	public static final By table_debits=By.xpath("//div[@class='fl']/table/tbody/tr[3]");
	public AccountHistory(WebDriver driver) {
		this.driver=driver;
	}
	
	public void displaybalanceDetail()
	{
		List<WebElement> list=driver.findElements(table_balancedetail);
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
		}
	}
	
	public void displayCredits()
	{
		List<WebElement> credittab=driver.findElements(table_credits);
		System.out.println(credittab.size());
		for(int j=0;j<credittab.size();j++) {
			System.out.println(credittab.get(j).getText());
		}
	}
	
	public void displayDebits()
	{
		List<WebElement> debittab=driver.findElements(table_debits);
		System.out.println(debittab.size());
		for(int k=0;k<debittab.size();k++) {
			System.out.println(debittab.get(k).getText());
		}
	}

}
