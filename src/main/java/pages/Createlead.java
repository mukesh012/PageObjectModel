package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class Createlead extends ProjectMethods{
	
	public Createlead() {
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(how=How.ID,using ="createLeadForm_companyName")
	private WebElement eleCmpnyNm;
	public Createlead cmpnynm(String data) {
		type(eleCmpnyNm,data);
		return this;
	}
	
	
	@FindBy(how=How.ID,using ="createLeadForm_firstName")
	private WebElement elefn;
	public Createlead firstnm(String data) {
		type(elefn,data);
		return this;
	}
	

	@FindBy(how=How.ID,using ="createLeadForm_lastName")
	private WebElement emplastnm;
	public Createlead lastnm(String data) {
		type(emplastnm,data);
		return this;
	}

	
	@FindBy(how=How.CLASS_NAME,using ="smallSubmit")
	private WebElement eleclickcretlead;
	public ViewLead clicksubmit() {
		click(eleclickcretlead);;
		return new ViewLead();
		
	}
}
