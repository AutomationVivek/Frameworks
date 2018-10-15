package week4.testng.contact.tcs;

import org.testng.annotations.Test;
import wdMethods.ProjectMethods;

public class DeactivateContactUsingInterface extends ProjectMethods{

	@Test
	public  void deactivateContactTC() throws InterruptedException
	{
		//login();
		click(locateElement("Xpath","//a[contains(text(),'CRM')]"));
		click(locateElement("Xpath","//a[text() = 'Contacts']"));
		click(locateElement("Xpath","//a[text() = 'Find Contacts']"));

		type(locateElement("Xpath","(//input[@name = 'firstName'])[3]"), "sa");
		click(locateElement("Xpath","//button[text() = 'Find Contacts']"));

		WebWait(("(//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		String contactid = getText(locateElement("Xpath","(//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
		clickWithoutSnap(locateElement("Xpath","(//div[@class = 'x-grid3-cell-inner x-grid3-col-partyId'])[1]/a"));
	
		verifyTitle("View Contact | opentaps");

		clickWithoutSnap(locateElement("Xpath","//a[@class='subMenuButtonDangerous']"));
		acceptAlert();

		verifyPartialText(locateElement("Xpath","//span[@class='subSectionWarning']"), "This contact was deactivated");
		click(locateElement("Xpath","//a[text() = 'Find Contacts']"));

		type(locateElement("Xpath","//input[@name = 'id']"), contactid);
		click(locateElement("Xpath","//button[text() = 'Find Contacts']"));

		verifyExactText(locateElement("Xpath","//div[text()='No records to display']"), "No records to display");

		closeBrowser();

	}
}
