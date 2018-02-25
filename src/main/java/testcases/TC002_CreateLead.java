package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC002_CreateLead extends ProjectMethods{
	
	@BeforeTest
	public void setData() {
		testCaseName="TC002_Createlead";
		testDescription="login to LeafTaps And Logout";
		testNodes="Leads";
		category="Smoke";
		authors="Sarath";
		browserName="chrome";
		dataSheetName="TC001";
	}
	
	@Test(dataProvider="fetchData")
	public void createLead(String uName,String pwd,String vName,String cmpnynm,String firstnm, String lname) {
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		.verifyLoggedName(vName)
		.clcikCRMlink()
		.clickleads()
		.leadsclick()
		.cmpnynm(cmpnynm)
		.firstnm(firstnm)
		.lastnm(lname)
		.clicksubmit();
		
		
	}

		
		

}
