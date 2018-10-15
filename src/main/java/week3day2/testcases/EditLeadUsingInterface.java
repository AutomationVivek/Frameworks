package week3day2.testcases;

import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class EditLeadUsingInterface extends ProjectMethods {
	@Test
	//@Test(dependsOnMethods= {"week3day2.testcases.CreateLeadUsingInterface.createLead"})
	//@Test(groups= {"smoke"})
	public void editLead() throws InterruptedException{
		
		click(locateElement("Linktext", "Find Leads"));
		type(locateElement("Xpath", "//label[text()='Lead ID:']/following::input[2]"), "b");
		click(locateElement("Xpath", "//button[text()='Find Leads']"));
		Thread.sleep(2000);
		getText(locateElement("Xpath", "(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a)[1]"));
		click(locateElement("Xpath", "(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a)[1]"));
		verifyTitle("View Lead");
		click(locateElement("Linktext", "Edit"));
		type(locateElement("updateLeadForm_companyName"), "crm");
		click(locateElement("Name", "submitButton"));
		verifyPartialText(locateElement("viewLead_companyName_sp"), "crm");
		
	}
}
