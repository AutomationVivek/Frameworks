package week3day2.testcases;

import org.testng.annotations.Test;
import wdMethods.ProjectMethods;


public class MergeLeadUsingInterface extends ProjectMethods{
	@Test
	//@Test(timeOut=2000)
	//@Test(groups= {"sanity"},dependsOnGroups= {"smoke"})
		public void mergeLead() throws InterruptedException{
		
			click(locateElement("Linktext", "Merge Leads"));
			click(locateElement("Xpath", "(//img[@alt='Lookup'])[1]"));
			switchToWindow(2);
			type(locateElement("Xpath", "//label[text()='Lead ID:']/following::input[1]"), "10106");
			click(locateElement("Xpath", "//button[text()='Find Leads']"));
			Thread.sleep(1000);
			clickWithoutSnap(locateElement("Xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)"));
			switchToWindow(0);
			Thread.sleep(1000);
			
			click(locateElement("Xpath", "(//img[@alt='Lookup'])[2]"));
			switchToWindow(2);
			type(locateElement("Xpath", "//label[text()='Lead ID:']/following::input[1]"), "10107");
			click(locateElement("Xpath", "//button[text()='Find Leads']"));
			Thread.sleep(1000);
			clickWithoutSnap(locateElement("Xpath", "(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)"));
			switchToWindow(0);
			Thread.sleep(1000);
			
			clickWithoutSnap(locateElement("Xpath", "//a[text()='Merge']"));
			acceptAlert();
			click(locateElement("Linktext", "Find Leads"));
			type(locateElement("Xpath", "//label[text()='Lead ID:']/following::input[1]"), "10106");
			click(locateElement("Xpath", "//button[text()='Find Leads']"));
			Thread.sleep(1000);
			String errmsg =getText(locateElement("Xpath", "//div[@class='x-paging-info']"));
			if (errmsg.startsWith("No records")) {
				System.out.println("the lead id  record merged succcessfully");
			}
			else
			{
				System.out.println("the lead id record not merged ");
			}
			closeBrowser();
		}
}
