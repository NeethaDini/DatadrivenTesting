package Automation.DatadrivenTesting;

import java.io.IOException;

import Automation.OnlineBanking.BaseDriver1;
import Automation.OnlineBanking.POM.AccountHistory;
import Automation.OnlineBanking.POM.LoginPage;
import Automation.OnlineBanking.POM.HomePage;

public class BankEg extends BaseDriver1{

	public static void main(String[] args) throws IOException {

    BaseDriver1 bd=new BaseDriver1();
    bd.getDriver();
    
    driver.get("http://demo.testfire.net/bank/login.aspx");
    LoginPage lp=new LoginPage(driver);
    lp.enterUserName("jsmith");
    lp.enterPassword("Demo1234");
    lp.clickLogin();
    
    HomePage mp=new HomePage(driver);
    mp.clicklinkViewAccSummary();
    mp.drpdownViewAccDetails("1001160140 Checking");
    mp.clickbtnGo();
    
    AccountHistory ah=new AccountHistory(driver);
    ah.displaybalanceDetail();
    ah.displayCredits();
    ah.displayDebits();
    

	}

}
