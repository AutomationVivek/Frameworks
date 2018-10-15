package week4.testng.contact.tcs;

import org.testng.annotations.Test;
import wdMethods.ProjectMethods;

public class CreateContactusingInterface extends ProjectMethods {
	@Test
	public  void createContactTC() throws InterruptedException
	{
		//login();
		click(locateElement("Xpath","//a[contains(text(),'CRM')]"));
		click(locateElement("Xpath","//a[contains(text(), 'Create Contact')]"));
		type(locateElement("Xpath","//input[@id = 'firstNameField']"), "Kalaiselvan");
		type(locateElement("Xpath","//input[@id = 'lastNameField']"), "Soundararajan");
		type(locateElement("Xpath","//input[@name = 'firstNameLocal']"), "Kalai");
		type(locateElement("Xpath","//input[@name = 'lastNameLocal']"), "Selva");

		type(locateElement("Xpath","//input[@name = 'personalTitle']"), "Cool");
		type(locateElement("Xpath","//input[@name = 'generalProfTitle']"), "Mr.");
		type(locateElement("Xpath","//input[@name = 'departmentName']"), "Mech Engineer");

		selectDropDownUsingText(locateElement("Xpath","//select[@name = 'preferredCurrencyUomId']"), "INR - Indian Rupee");

		type(locateElement("Xpath","//textarea[@name = 'description']"), "Puppy Face");
		type(locateElement("Xpath","//textarea[@name = 'importantNote']"), "Smiley boy");
		type(locateElement("Xpath","//input[@id= 'createContactForm_primaryPhoneAreaCode']"), "7");
		type(locateElement("Xpath","//input[@name= 'primaryPhoneExtension']"), "401122");
		type(locateElement("Xpath","//input[@id= 'createContactForm_primaryEmail']"), "yk@gmail.com");
		type(locateElement("Xpath","//input[@id= 'createContactForm_primaryPhoneNumber']"), "9944184589");
		type(locateElement("Xpath","//input[@name= 'primaryPhoneAskForName']"), "Rose");

		

		type(locateElement("Xpath","//input[@name= 'generalAddress1']"), "Happy Home");
		type(locateElement("Xpath","//input[@name= 'generalCity']"), "Chennai");	
		type(locateElement("Xpath","//input[@name= 'generalPostalCode']"), "600023");	
		type(locateElement("Xpath","//input[@name= 'generalPostalCodeExt']"), "000");	
		type(locateElement("Xpath","//input[@name= 'generalAttnName']"), "Artselvan");	
		type(locateElement("Xpath","//input[@name= 'generalAddress2']"), "Happiness");
		selectDropDownUsingText(locateElement("Xpath","//select[@name= 'generalCountryGeoId']"), "India");
		//selectDropDownUsingText(locateElement("Xpath","//select[@name= 'generalStateProvinceGeoId']"), "TAMILNADU");

		String str = locateElement("Xpath","//input[@name= 'generalToName']").getAttribute("value");
		
		//getText(locateElement("//form[@id='createContactForm']//div[2]/table//tr[15]/td[2]/input"));
		
		clickWithoutSnap(locateElement("Xpath","//input[@value= 'Create Contact']"));
		getText(locateElement("Xpath","//span[@id= 'viewContact_fullName_sp']"));
		verifyPartialText(locateElement("Xpath","//span[@id= 'viewContact_fullName_sp']"), str);

		click(locateElement("Xpath","//a[text()= 'Edit']"));
		selectDropDownUsingText(locateElement("Xpath","//select[@name= 'marketingCampaignId']"), "Car and Driver");
		click(locateElement("Xpath","//input[@value= 'Add']"));
		click(locateElement("Xpath","//input[@value='Update']"));


		verifyExactText(locateElement("Xpath","//span[@id='viewContact_marketingCampaigns_sp']"), "Car and Driver");
		
		closeBrowser();
	}
}
