package week2day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestLeafLogin {

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
//create lead page
		driver.findElementByLinkText("Create Lead").click();

		driver.findElementById("createLeadForm_companyName").sendKeys("Testleaf");

		driver.findElementById("createLeadForm_firstName").sendKeys("AarthiDhana");

		driver.findElementById("createLeadForm_lastName").sendKeys("SriniTanga");

		driver.findElementByName("submitButton").click();
		
		//to select from drop down type 1
		driver.findElementById("createLeadForm_dataSourceId").sendKeys("Employee");

		//using select class type 2
		WebElement dropobj = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dd= new Select(dropobj);
		dd.selectByVisibleText("Automobile");
		Thread.sleep(1000);
		List<WebElement> options = dd.getOptions();
		
		//to select last before value
		options.size();
		dd.selectByIndex(options.size()-2);
		
		//to print all items
		for (WebElement indivalues : options) {
			System.out.println(indivalues.getText());
		}
//find lead
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//label[text()='Lead ID:']/following::input[2]").sendKeys("b");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a")));
		//WebElement element = driver.findElementByXPath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a");
		//wait.until(ExpectedConditions.elementToBeClickable(element));
		driver.findElementByXPath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a").click();


	}


}

//(//a[@class='linktext'])[4]
//(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]
//(//img[@alt='Lookup'])[2]
//(//	button[@class='x-btn-text'])[7]

//(//em[@unselectable='on']/button)[7]




