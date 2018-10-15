package week3day2.testcases;

import org.testng.annotations.Test;
import wdMethods.ProjectMethods;

public class DeactivateAccount extends ProjectMethods {
	@Test(groups= {"Regression"},dependsOnGroups= {"sanity"})
	
	public void deactivateAccount() throws InterruptedException{
		Thread.sleep(2000);
		click(locateElement("Xpath", "(//div[@id='label']/a)[1]"));
		click(locateElement("Xpath", "//a[text()='Accounts']"));
		click(locateElement("Xpath", "//a[text()='Find Accounts']"));
		type(locateElement("Xpath", "(//input[@name='accountName'])[2]"), "Aarthi");
		type(locateElement("Xpath", "//input[@name='id']"), "11369");
		click(locateElement("Xpath", "//button[text()='Find Accounts']"));
		Thread.sleep(2000);
		String id =getText(locateElement("Xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)"));
		click(locateElement("Xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)"));
		verifyTitle("Account Details | opentaps CRM");
		clickWithoutSnap(locateElement("Xpath", "//a[text()='Deactivate Account']"));
		getAlertText();
		acceptAlert();
		verifyPartialText(locateElement("Xpath", "//span[@class='subSectionWarning']"),"This account was deactivated");
		click(locateElement("Xpath", "//a[text()='Find Accounts']"));
		//type(locateElement("Xpath", "(//input[@class=' x-form-text x-form-field '])[2]"), "Dhana");
		type(locateElement("Xpath", "//input[@name='id']"), id);
		click(locateElement("Xpath", "//button[text()='Find Accounts']"));
		verifyExactText(locateElement("Xpath", "//div[@class='x-paging-info']"),"No records to display");
		}
}
