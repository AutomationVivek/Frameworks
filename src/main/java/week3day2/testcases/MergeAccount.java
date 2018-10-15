package week3day2.testcases;

import org.junit.Test;

import wdMethods.ProjectMethods;

public class MergeAccount extends ProjectMethods {

	@Test
	public void mergeAccount() throws InterruptedException{
		//login();
		Thread.sleep(2000);
		click(locateElement("Xpath", "(//div[@id='label']/a)[1]"));
		click(locateElement("Xpath", "//a[text()='Accounts']"));
		click(locateElement("Xpath", "//a[text()='Merge Accounts']"));
		
		click(locateElement("Xpath", "(//img[@alt='Lookup'])[1]"));
		switchToWindow(2);
		type(locateElement("Xpath", "//input[@name='id']"), "11287");
		click(locateElement("Xpath", "//button[text()='Find Accounts']"));
		Thread.sleep(2000);
		clickWithoutSnap(locateElement("Xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)"));
		switchToWindow(0);
		
		click(locateElement("Xpath", "(//img[@alt='Lookup'])[2]"));
		switchToWindow(2);
		type(locateElement("Xpath", "//input[@name='id']"), "11386");
		click(locateElement("Xpath", "//button[text()='Find Accounts']"));
		Thread.sleep(2000);
		clickWithoutSnap(locateElement("Xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)"));
		switchToWindow(0);
		
		clickWithoutSnap(locateElement("Xpath", "//a[text()='Merge']"));
		acceptAlert();
		click(locateElement("Xpath", "//a[text()='Find Accounts']"));
		type(locateElement("Xpath", "//input[@name='id']"), "11287");
		click(locateElement("Xpath", "//button[text()='Find Accounts']"));
		
		verifyExactText(locateElement("Xpath", "//div[@class='x-paging-info']"),"No records to display");
		closeBrowser();
	}
}
