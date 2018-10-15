package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestleafEditLead {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//label[text()='Lead ID:']/following::input[2]").sendKeys("b");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("((//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]")));
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]").click();
		//Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Edit']")));
		System.out.println(driver.getTitle());
		driver.findElementByXPath("//a[text()='Edit']").click();
		System.out.println(driver.getTitle());
		String oldcompnme = driver.findElementByXPath("//input[@id='updateLeadForm_companyName']").getAttribute("value");
		System.out.println(oldcompnme);
		driver.findElementById("updateLeadForm_companyName").clear();
		driver.findElementById("updateLeadForm_companyName").sendKeys("Hexaware tech");
		Thread.sleep(1000);
		driver.findElementByXPath("(//input[@class='smallSubmit'])[1]").click();
		Thread.sleep(1000);
		String newcompname = driver.findElementByXPath("//span[@id='viewLead_companyName_sp']").getText();
		System.out.println(newcompname);
		if (oldcompnme == newcompname) {
			System.out.println("Company name not updated successfully from "+oldcompnme+ " to "+newcompname);	
		}
		else
		{
			System.out.println("Company name updated successfully from "+oldcompnme+ " to "+newcompname);	
		}
		driver.close();
	}

}


