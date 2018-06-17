package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.CreateLeadPage;
import pages.HomePage;
import pages.LoginPage;
import pages.MyHomePage;
import pages.MyLeadsPage;
import wdMethods.ProjectMethods;

public class TC004_Edit_Lead extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC003_Create_Lead";
		testDescription="login and logout in LeafTaps Application";
		testNodes="Leads";
		category="Smoke";
		authors="Hrushikesh";
		browserName="chrome";
		dataSheetName="TC004";
	}
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String companyname,String firstName,String lastName) {
		
		new LoginPage().enterUserName(uName).enterPassword(pwd).clickLogIn();
		new HomePage().clickcrmsfa();
		new MyHomePage().MyLeads();
		new MyLeadsPage().ClickcreateLeads();
		new CreateLeadPage().enterCompanyName(companyname).enterfirstName(firstName).enterlastName(lastName).submitcreatelead();
		
		}

}
	