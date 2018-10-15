package week4day1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.chrome.ChromeDriver;

public class regex_viewlead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.leaftaps.com/opentaps");

		driver.findElementById("username").sendKeys("DemoSalesManager");

		driver.findElementById("password").sendKeys("crmsfa");

		driver.findElementByClassName("decorativeSubmit").click();

		driver.findElementByLinkText("CRM/SFA").click();

		driver.findElementByLinkText("Leads").click();
//create lead page
		driver.findElementByLinkText("Create Lead").click();

		driver.findElementById("createLeadForm_companyName").sendKeys("Testleaf");

		driver.findElementById("createLeadForm_firstName").sendKeys("AarthiDhana");

		driver.findElementById("createLeadForm_lastName").sendKeys("SriniTanga");

		driver.findElementByName("submitButton").click();
		
		String text = driver.findElementById("viewLead_companyName_sp").getText();
		System.out.println(text);
		String patt="\\d{5}";
		Pattern p=Pattern.compile(patt);
		Matcher m=p.matcher(text);
		if (m.find())
			System.out.println(m.group());


	}

}
