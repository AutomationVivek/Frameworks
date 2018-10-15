package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestleafDeleteLead {

	public static void main(String[] args) throws InterruptedException {
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
			driver.findElementByXPath("(//span[@class='x-tab-strip-text '])[2]").click();
			driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("123456792");
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			Thread.sleep(1000);
			WebDriverWait wait = new WebDriverWait(driver, 10);
			//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]")));
			String leadname = driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]").getText();
			System.out.println("the lead id is "+leadname);
			driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]").click();
			//Thread.sleep(1000);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Delete']")));
			System.out.println("before lead id delete title name "+driver.getTitle());
			driver.findElementByXPath("//a[text()='Delete']").click();
			Thread.sleep(1000);
			driver.findElementByLinkText("Find Leads").click();
			System.out.println("After clicking find leads title name "+driver.getTitle());
			driver.findElementByXPath("//label[text()='Lead ID:']/following::input[1]").sendKeys(leadname);
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			Thread.sleep(1000);
			String errmsg = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
			if (errmsg.startsWith("No records")) {
				System.out.println("the lead id "+leadname+ "record deleted succcessfully");
			}
			else
			{
				System.out.println("the lead id "+leadname+ "record not deleted ");
			}
			
			driver.close();
	}

}
