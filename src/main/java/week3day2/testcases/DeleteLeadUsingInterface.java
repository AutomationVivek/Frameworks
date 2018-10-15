package week3day2.testcases;

import org.testng.annotations.Test;

import wdMethods.ProjectMethods;

public class DeleteLeadUsingInterface extends ProjectMethods {
	@Test
	//@Test(dependsOnMethods= {"week3day2.testcases.CreateLeadUsingInterface.createLead"} ,enabled=false)
	//@Test(groups= {"sanity"},dependsOnGroups= {"smoke"})
	public void deleteLead() throws InterruptedException{
		//create lead
		click(locateElement("Linktext", "Create Lead"));
		type(locateElement("createLeadForm_companyName"), "SalesManager");
		type(locateElement("createLeadForm_firstName"), "Manager");
		type(locateElement("createLeadForm_lastName"), "Demo");
		type(locateElement("createLeadForm_primaryPhoneNumber"), "9976766068");
		click(locateElement("Name", "submitButton"));

		//find lead to delete using phone number
		click(locateElement("Linktext", "Find Leads"));
		click(locateElement("Xpath", "(//span[@class='x-tab-strip-text '])[2]"));
		type(locateElement("Xpath", "(//div[@class= 'x-plain-body x-plain-body-noheader x-plain-body-noborder']/input)[13]"), "9976766068");
		click(locateElement("Xpath", "(//button[@class='x-btn-text'])[7]"));
		Thread.sleep(2000);
		String text = getText(locateElement("Xpath", "(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a)[1]"));
		click(locateElement("Xpath", "(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a)[1]"));
		click(locateElement("Linktext", "Delete"));
		click(locateElement("Linktext", "Find Leads"));
		type(locateElement("Xpath", "( //div[@class = 'x-form-element']/input)[13]"), text);
		click(locateElement("Xpath", "(//td[@class='x-btn-center'])[7]"));
		Thread.sleep(3000);
		getText(locateElement("Xpath", "//div[@class = 'x-paging-info']"));
		verifyExactText(locateElement("Xpath", "//div[@class = 'x-paging-info']"), "No records to display");
		
	}
}
