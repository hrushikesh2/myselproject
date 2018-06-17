package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods{
	
	public MyLeadsPage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.PARTIAL_LINK_TEXT,using="Create")
	private WebElement createLeads;
	 
	public CreateLeadPage ClickcreateLeads() {
		click(createLeads);
		return new CreateLeadPage();
	}
	
	@FindBy(how=How.PARTIAL_LINK_TEXT,using="Find Leads")
	private WebElement findleads;
	 
	public FindLeadPage ClickfindLeads() {
		click(findleads);
		return new FindLeadPage();
	}

	
	@FindBy(how=How.NAME,using="firstName")
	private WebElement firstName;
	 
	public FindLeadPage Enterfirstname(String data) {
		type(firstName,data);
		return new FindLeadPage();
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement searchlead;
	 
	public MyLeadsPage Clickfindlead(String data) {
		type(searchlead,data);
		return this;
	}
	
	@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
	private WebElement searchlead1;
	 
	public MyLeadsPage Clickfindlead1(String data) {
		type(searchlead,data);
		return this;
	}
	
	
	
	
	

}
