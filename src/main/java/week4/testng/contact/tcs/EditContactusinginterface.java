package week4.testng.contact.tcs;

import org.junit.Test;
import wdMethods.ProjectMethods;

public class EditContactusinginterface extends ProjectMethods {
	@Test
	public  void editContactTC() throws InterruptedException
	{
		//login();
		click(locateElement("Xpath","//a[contains(text(),'CRM')]"));
		click(locateElement("Xpath","//a[text() = 'Contacts']"));
		click(locateElement("Xpath","//a[text() = 'Find Contacts']"));

		type(locateElement("Xpath","(//input[@name = 'firstName'])[3]"), "sa");
		click(locateElement("Xpath","//button[text() = 'Find Contacts']"));

		WebWait(("(//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		click(locateElement("Xpath","(//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		verifyTitle("View Contact | opentaps");

		click(locateElement("Xpath","//a[text()= 'Edit']"));
		locateElement("Xpath","//input[@id= 'updateContactForm_firstName']").clear();

		type(locateElement("Xpath","//input[@id= 'updateContactForm_firstName']"), "testing");
		click(locateElement("Xpath","//input[@value='Update']"));

		verifyPartialText(locateElement("Xpath","//span[@id='viewContact_fullName_sp']"), "testing");

		closeBrowser();


	}
}
