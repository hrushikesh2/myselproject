package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLeadPage extends ProjectMethods{
	
	public CreateLeadPage() {		
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.PARTIAL_LINK_TEXT,using="Create")
	private WebElement createLeads;
	 
	public CreateLeadPage MyLeadsPage() {
		click(createLeads);
		return  this;
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement companyName;
	
	public CreateLeadPage enterCompanyName(String data) {
		type(companyName, data);
		return this;
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement firstName;
	
	public CreateLeadPage enterfirstName(String data) {
		type(firstName, data);
		return this;
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement lastName;
	
	public CreateLeadPage enterlastName(String data) {
		type(lastName, data);
		return this;
	}
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement submit;
	
	public void submitcreatelead() {
		click(submit);
		//return ViewLeadPage();
	}

}
