package week3day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MergeLead_testleaf {

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
			driver.findElementByLinkText("Merge Leads").click();
			driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();
			Set<String> allwindows = driver.getWindowHandles();
			List<String> winlist = new ArrayList<String>();
			winlist.addAll(allwindows);
			driver.switchTo().window(winlist.get(2));
			System.out.println(driver.getTitle());
			driver.findElementByXPath("//label[text()='Lead ID:']/following::input[1]").sendKeys("10413");
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			Thread.sleep(1000);
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)")));
			driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)").click();
			driver.switchTo().window(winlist.get(0));
			
			driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();
			Set<String> allwindows1 = driver.getWindowHandles();
			List<String> winlist1 = new ArrayList<String>();
			winlist1.addAll(allwindows1);
			driver.switchTo().window(winlist1.get(2));
			System.out.println(driver.getTitle());
			driver.findElementByXPath("//label[text()='Lead ID:']/following::input[1]").sendKeys("10415");
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			Thread.sleep(1000);
			WebDriverWait wait1 = new WebDriverWait(driver, 70);
			wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)")));
			driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)").click();
			driver.switchTo().window(winlist.get(0));
			
			driver.findElementByXPath("//a[text()='Merge']").click();
			driver.switchTo().alert().accept();
			driver.findElementByLinkText("Find Leads").click();
			driver.findElementByXPath("//label[text()='Lead ID:']/following::input[1]").sendKeys("10413");
			driver.findElementByXPath("//button[text()='Find Leads']").click();
			Thread.sleep(1000);
			String errmsg = driver.findElementByXPath("//div[@class='x-paging-info']").getText();
			if (errmsg.startsWith("No records")) {
				System.out.println("the lead id  record merged succcessfully");
			}
			else
			{
				System.out.println("the lead id record not merged ");
			}
			
			driver.close();
	}

}
